package com.objects;

public class Exceptions {
    public static void main(String[] args) {
        String[] st = new String[2];

        try {
            System.out.println(st[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Индекс элемента находился вне границ массива");
        }


        try {
            System.out.println(st[5]);
        } catch (Exception ex) {
            System.out.println("Ошибка!");
        }

    }
}
