package com.dumi.OCAJSE8PI.C5ClassDesign;

public abstract class AbstractMethods {
    public abstract String getName();
    public abstract int getAge();

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.getName());
        lion.roar();
        System.out.println(lion.getAge());;
    }
}

abstract class BigCat extends AbstractMethods {
    public abstract void roar();

    public int getAge() {
        return 7;
    }
}

class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}