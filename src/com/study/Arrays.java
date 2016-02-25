package com.study;

/*
 * Created by 79815 on 13.02.2016.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;

        for (int k = 0; k < a.length; k++) {
            a[k] = k * k;
        }


        for (int s : a) {
            System.out.println("a[" + i + "] = " + s);
            i++;
        }
    }
}
