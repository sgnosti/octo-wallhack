package de.sgnosti.playground.flink;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

public class TestDataSource {
    private final ExecutionEnvironment environment = ExecutionEnvironment.getExecutionEnvironment();
    final DataSource<String> dataSource;

    public TestDataSource(String path) {
	dataSource = environment.readTextFile(getClass().getClassLoader().getResource(path).getFile());
    }

    public DataSource<String> getDataSource() {
	return dataSource;
    }

    public <T> void map(Function<T> function) {
	final MapFunction<String, T> mapper = new MapFunction<String, T>() {
	    private static final long serialVersionUID = 3289084438139502611L;

	    @Override
	    public T map(String value) {
		for (final String word : value.split(" ")) {
		    out.collect(word);
		}
		return null;
	    }
	};
	dataSource.map(mapper);
    }

    // final DataSet<String> words = test.getDataSource().flatMap((value, out)
    // -> {
    // for (final String string : value.split(" ")) {
    // out.collect(string);
    // }

    @FunctionalInterface
    interface Function<T> {
	T map(String value);
    }

}