package com.dumi.OCAJSE8PI.C5ClassDesign;

public class HidingStaticMethods extends Panda {
    public static void main(String[] args) {
        Panda.eat();
    }
}

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
}