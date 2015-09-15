package de.sgnosti.playground.flink;

import org.apache.flink.api.java.DataSet;

import de.sgnosti.playground.util.Pair;

public class Main {

    private static final String DATA_PATH = "alice.txt";

    public static void main(String[] args) throws Exception {
	final TestDataSource test = new TestDataSource(DATA_PATH);
	test.map((value) -> new Pair(value, 1));

	final DataSet<String> words = test.getDataSource().flatMap((value, out) -> {
	    for (final String string : value.split(" ")) {
		out.collect(string);
	    }
	});

	words.print();

	System.out.println("END");
    }

}
