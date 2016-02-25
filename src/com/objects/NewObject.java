package com.objects;

import com.study.Pascal;

/*
 * Created by 79815 on 13.02.2016.
 */
public class NewObject {

    static Cat myCat = new Cat(2, "George", "Blue");

    public static void main(String[] args) {
        Pascal.writeln(myCat.toString());
        myCat.myau();
    }
}
