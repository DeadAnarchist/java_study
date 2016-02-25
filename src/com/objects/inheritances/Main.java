package com.objects.inheritances;

/*
 * Created by 79815 on 14.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        First ages1 = new First(15, 25);
        System.out.println(ages1.sum());
        ages1.writeClass();


        Second ages2 = new Second(10, 20);
        ages2.writeSum();
        ages2.writeClass();
    }
}
