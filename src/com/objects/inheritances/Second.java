package com.objects.inheritances;

public class Second extends First {
    public Second(int a, int b) {
        super(a, b);
    }

    public void writeSum() {
        System.out.println(this.sum());
    }

    @Override
    public void writeClass() {
        System.out.println("Second");
    }
}
