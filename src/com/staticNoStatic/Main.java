package com.staticNoStatic;

public class Main {

    public static void main(String[] args) {
        System.out.println(ExampleStatic.a);
        ExampleStatic.get();
        System.out.println(ExampleStatic.a);

        ExampleNoStatic ns = new ExampleNoStatic();
        System.out.println(ns.a);
        ns.get();
        System.out.println(ns.a);
    }

}

