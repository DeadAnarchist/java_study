package com.study;

public class Recursion {
    public static void main(String[] args){
        int val = recursion(2, -2);
        System.out.println(val);
    }

    static int recursion(int a, int b){
        int sum = a + b;
        if (sum == 0){
            sum = recursion(Math.abs(a), Math.abs(b));
        }
        return sum;
    }
}
