package com.dumi.OCAJSE8PI.C5ClassDesign;

public class OverridingMethod1 {

    public static void main(String[] args) {
        System.out.println(new Eagle().fly(5));
        System.out.println(new Eagle().eat(3));
    }
}

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public int eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }
}

class Eagle extends Bird {
    public int fly(int height) { //  overloaded in the subclass
        System.out.println("_Bird is flying at " + height + " meters");
        return height;
    }

    public int eat(int food) { // overridden in the subclass
        System.out.println("_Bird is eating " + food + " units of food");
        return food;
    }
}