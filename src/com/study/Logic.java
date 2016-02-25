package com.study;

/*
 * Created by 79815 on 13.02.2016.
 */
public class Logic {
    public static void main(String[] args) {

        boolean bool = false;

        if (bool) {
            System.out.println("bool = true");
        } else {
            System.out.println("bool = false");
        }

        int a = Pascal.random100();

        System.out.println("a = " + a);
        if (a > 0) {
            System.out.println("a>0");
        } else if (a < 0) {
            System.out.println("a<0");
        } else {
            System.out.println("a==0");
        }
        a = 1;
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
            case 4:
                System.out.println("a=4");
                break;
            case 5:
                System.out.println("a=5");
                break;
        }

        int l1 = 1;
        int l2 = 0;

        if (l1 == 1 && l2 == 0) {
            System.out.println("l1 == 1 &&   l2 == 0");
        }
        if (l1 == 1 && !(l2 == 2)) {
            System.out.println("l1 == 1 && !(l2 == 2)");
        }

        if (l1 == 1 || l2 == 2) {
            System.out.println("l1 == 1 ||   l2 == 2");
        }
    }
}
