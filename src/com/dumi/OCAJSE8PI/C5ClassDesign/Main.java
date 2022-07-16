package com.dumi.OCAJSE8PI.C5ClassDesign;

public class Main {
    public static void main(String[] args) {
        Zebra zebra = new Zebra();
        int initialAge = zebra.getAge();
        zebra.setAge(5);
        int finalAge = zebra.getAge();

        System.out.println(initialAge + " " + finalAge);

        Gorilla gorilla = new Gorilla(7);
        System.out.println(gorilla);
        System.out.println(gorilla.getName()+ " has " + gorilla.getAge() + " years");
    }
}
