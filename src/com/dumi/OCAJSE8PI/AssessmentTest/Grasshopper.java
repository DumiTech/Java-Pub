package com.dumi.OCAJSE8PI.AssessmentTest;

public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
//        System.out.println(name);
    }

    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;
    }

    private String name;
}
