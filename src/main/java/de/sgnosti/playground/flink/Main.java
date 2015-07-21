package de.sgnosti.playground.flink;

import org.apache.flink.api.java.DataSet;

public class Main {

    static class Pair<T, U> {

	public Pair(T t, U u) {
	    if (t == null || u == null) {
		throw new IllegalArgumentException("pair not allowed: " + t + ", " + u);
	    }
	    this.t = t;
	    this.u = u;
	}

	T t;
	U u;

	@Override
	public int hashCode() {
	    return (t.hashCode() + u.hashCode()) / 31;
	}

	@Override
	public boolean equals(Object obj) {
	    if (obj == null)
		return false;
	    if (obj == this)
		return true;
	    if (obj.getClass() != getClass())
		return false;
	    return t.equals(((Pair<?, ?>) obj).t) && u.equals(((Pair<?, ?>) obj).u);
	}
    }

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
