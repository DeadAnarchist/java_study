package com.objects;

public class Cat {
    private int age;
    private String name;
    private String race;
    private final String MYAU = "myau-myau";

    public void myau() {
        System.out.println(MYAU);
    }

    public Cat(int age, String name, String race) {
        this.age = age;
        this.name = name;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "age = " + age +
                ", name ='" + name + '\'' +
                ", race = '" + race + '\'' +
                '}';
    }
}
