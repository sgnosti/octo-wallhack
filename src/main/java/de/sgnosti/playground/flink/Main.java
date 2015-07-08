package de.sgnosti.playground.flink;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

public class Main {

    private static final String DATA_PATH = "data.txt";

    public static void main(String[] args) throws Exception {
	final Test test = new Test(DATA_PATH);

	final DataSet<Integer> tokenized = test.data.map(new MapFunction<String, Integer>() {
	    private static final long serialVersionUID = -8203093781035152225L;

	    public Integer map(String value) throws Exception {
		return Integer.parseInt(value);
	    }
	});

	tokenized.print();

	System.out.println("END");
    }

    static class Test {
	private final ExecutionEnvironment environment = ExecutionEnvironment.getExecutionEnvironment();
	private final DataSource<String> data;

	public Test(String path) {
	    data = environment.readTextFile(getClass().getClassLoader().getResource(path).getFile());
	}

    }

}
