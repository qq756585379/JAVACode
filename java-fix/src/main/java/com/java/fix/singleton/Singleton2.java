package com.java.fix.singleton;

public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 single = null;

    public static synchronized Singleton2 getInstance() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }
}
