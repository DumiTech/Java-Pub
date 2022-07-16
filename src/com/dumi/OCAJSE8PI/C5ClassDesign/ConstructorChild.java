package com.dumi.OCAJSE8PI.C5ClassDesign;

public class ConstructorChild extends ConstructorParent{

    public ConstructorChild() {
        super();
        System.out.println("ConstructorChild constructor with no arguments.");
    }

    public ConstructorChild(String str, String str1, float f) {
        super("Dollar", "USA", 0.95f);
        System.out.println("ConstructorChild constructor with 3 arguments.");
    }

    public ConstructorChild(String currency, String country, float value, int days) {
        this.currency = currency;
        this.country = country;
        this.value = value;
        System.out.println("ConstructorChild constructor with 4 arguments.");
        System.out.println(this.currency + " / " + this.country + " / " + this.value + " / => for the last " + days + " days");
    }

    public static void main(String[] args) {
        ConstructorChild constructorChild = new ConstructorChild();
        ConstructorChild constructorChild3 = new ConstructorChild("", "", 1.1f);
        System.out.println(constructorChild3.currency + " / " + constructorChild3.country + " / " + constructorChild3.value);
        ConstructorChild constructorChild4 = new ConstructorChild("Euro", "Germany", 1.1f, 2);

    }
}
