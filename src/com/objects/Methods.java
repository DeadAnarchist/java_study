package com.objects;

public class Methods {

    public static String get(){
        return "get()";
    }

    public static String get(String s){
        return s;
    }

    public static String get(String n, String m){
        return n+m;
    }

    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(get("get(String s)"));
        System.out.println(get("get(String n, ", "String m)"));
    }
}
