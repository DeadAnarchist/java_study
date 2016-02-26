package com.objects;

class MyException extends Exception {
    @Override
    public void printStackTrace() {
        System.err.println("It's my first Exception");
    }
}

public class Exceptions {
    public static void main(String[] args) {
        String[] st = new String[2];

        try {
            System.out.println(st[5]);
        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println("Индекс элемента находился вне границ массива");
        }


        try {
            System.out.println(st[5]);
        } catch (Exception ex2) {
            System.out.println("Ошибка!");
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception ex3) {
            System.out.println("Принудительно вызванное исключение!");
        }

        try {
            throw new MyException();
        } catch (Exception ex4) {
            ex4.printStackTrace();
        }
    }
}
