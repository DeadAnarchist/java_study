package com.objects;

import com.study.Pascal;

public class NewObject {

    static Cat myCat = new Cat(2, "George", "Blue");

    public static void main(String[] args) {
        Pascal.writeln(myCat.toString());
        myCat.myau();
    }
}
