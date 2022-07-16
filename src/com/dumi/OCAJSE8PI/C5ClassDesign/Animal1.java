package com.dumi.OCAJSE8PI.C5ClassDesign;

public class Animal1 {
    private int age;
    private String name;
    public Animal1(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal1(int age) {
        super();
        this.age = age;
        this.name = null;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

class Gorilla extends Animal1 {
    public Gorilla(int age) {
        super(age,"Gorilla");
    }
//    public Gorilla() {
//        super(5);
//    }
}
