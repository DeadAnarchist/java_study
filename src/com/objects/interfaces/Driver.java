package com.objects.interfaces;

public class Driver implements Transport, Drivers {

    String category = " ";

    @Override
    public void setCategory(String c) {
        if (c.equals("")) {
            this.category = " ";
        } else {
            this.category = c;
        }
    }

    @Override
    public void go() {
        if (!this.category.equals(" ")) {
            System.out.println("GO");
        }
    }

}
