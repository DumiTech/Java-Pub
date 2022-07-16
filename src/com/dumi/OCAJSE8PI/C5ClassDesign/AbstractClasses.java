package com.dumi.OCAJSE8PI.C5ClassDesign;

public class AbstractClasses {
    public static void main(String[] args) {
        System.out.println(new Swan().getName());
    }
}

abstract class Animal2 {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}

class Swan extends Animal2 {
    public String getName() {
        return "Swan";
    }
}