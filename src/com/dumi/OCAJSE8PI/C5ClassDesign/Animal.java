package com.dumi.OCAJSE8PI.C5ClassDesign;

public class Animal {
    private int age;
    public Animal(int age) {
        super();
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
    }
    public Zebra() {
        this(4);
    }
}
