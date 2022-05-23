package com.dumi.OCAJSE8PI.C1JavaBuildingBlocks;

public class Chicken {
    private String name;
    public String surname = "Jeremy";

    public Chicken(String name, String surname) {
        name = name;
        this.surname = surname;
        System.out.println(name + surname);
    }

    public Chicken() {
        String name = "Rosalina";
        System.out.println(name);
        System.out.println("in constructor");
    }

    public Chicken(String name) {
        this.name = name;
        System.out.println(name);
    }


}
