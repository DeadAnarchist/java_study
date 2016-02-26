package com.study;

public class Pascal {
    public static void main(String[] args){

    }

    public static void write(String s) {
        System.out.print(s);
    }

    public static void writeln(String s) {
        System.out.println(s);
    }

    public static int random100(){
        long res = Math.round(Math.random() * 100);
        Number n = res;
        if (Math.round(Math.random() * 100)>=50) {
            return n.intValue();
        } else {
            return -n.intValue();
        }
    }
}
