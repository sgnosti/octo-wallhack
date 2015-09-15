package de.sgnosti.playground.util;

public class Pair<T, U> {

    public Pair(T t, U u) {
	if (t == null || u == null) {
	    throw new IllegalArgumentException("null not allowed: " + t + ", " + u);
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