package com.objects.inheritances;

/*
 * Created by 79815 on 14.02.2016.
 */
public class First {
    private int a;
    private int b;

    public First(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public void writeClass(){
        System.out.println("First");
    }
}
