package com.study;

public class Types {
    public static void main(String[] args) {

        byte b = 127;
        short sh = 32000;
        int it = 2000000000;
        long l = 999999999;

        float fl = 2.6f;
        double dl = 2.6;

        boolean bool1 = true;
        boolean bool0 = false;

        char ch1 = '@';
        char ch2 = 32;
        char ch3 = 0x20;
        String st = "Good" + ch2 + ch3 + "job";

        Byte b_ = 127;
        Short sh_ = 32000;
        Integer it_ = 2000000000;
        Float fl_ = 2.6f;
        Double dl_ = 2.6;

        final int NULL = 0;

        System.out.println("byte    = " + b);
        System.out.println("short   = " + sh);
        System.out.println("int     = " + it);
        System.out.println("long    = " + l);
        System.out.println("float   = " + fl);
        System.out.println("double  = " + dl);
        System.out.println("boolean = " + bool1);
        System.out.println("boolean = " + bool0);
        System.out.println("char    = " + ch1);
        System.out.println("char    = " + ch2);
        System.out.println("String  = " + st);
        System.out.println("final   = " + NULL);

        int i1 = 2;
        System.out.print(i1);
        double d1 = 5.5;
        i1 = (int) d1;
        System.out.println("-" + i1);
        d1 = i1;

//        d1 = Float.valueOf(fl_);
        d1 = fl_;
//        fl_ = Float.valueOf(fl);
        fl_ = fl;
        System.out.print(d1 + 0.0000001 + "-" + fl_);

        Number n1 = fl;
        Number n2 = new Double(2.6);
        Integer it1 = n1.intValue();
        int it2 = n1.intValue();
    }
}
