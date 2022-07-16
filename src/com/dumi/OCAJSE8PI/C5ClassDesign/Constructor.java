package com.dumi.OCAJSE8PI.C5ClassDesign;

public class Constructor {
    private String str = "demo";
    private int number = 5;

    public Constructor() {
        this("test");
        System.out.println("Constructor with no arguments fired.");
    }
    public Constructor(String str) {
        this("test", 3);
        System.out.println("Constructor with one argument fired.");
    }
    public Constructor(String str, int number) {
        this.str = str;
        this.number = number;
        System.out.println("Constructor with 2 arguments fired.");
    }

    public static void main(String[] args) {
        Constructor practice = new Constructor("demo", 33);
        System.out.println(practice.str);
        System.out.println(practice.number);
    }
}
