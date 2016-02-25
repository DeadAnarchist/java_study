package com.objects.inheritances;

/*
 * Created by 79815 on 14.02.2016.
 */
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
