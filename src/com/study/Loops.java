package com.study;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("loop FOR " + i);
        }

        int i = 10;
        while (i >= 1) {
            System.out.println("loop WHILE " + i);
            i--;
        }

        String[] st = "Hello World".split(" ");//array (list)
        for (String s : st) {
            System.out.print(s+" ");
        }
    }
}
