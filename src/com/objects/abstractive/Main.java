package com.objects.abstractive;

public class Main {

    public static void main(String[] args) {

        Animals cat = new Animals() {
            @Override
            void eat() {
                System.out.println("ням-ням");
            }

            @Override
            void say() {
                System.out.println("мяу-мяу");
            }
        };

        cat.eat();
        cat.say();
    }
}
