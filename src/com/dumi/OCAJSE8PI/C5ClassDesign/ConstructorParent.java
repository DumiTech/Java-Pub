package com.dumi.OCAJSE8PI.C5ClassDesign;

public class ConstructorParent {
    String currency;
    String country;
    float value;

    public ConstructorParent() {
        System.out.println("ConstructorParent constructor with no arguments.");
    }

    public ConstructorParent(String currency, String country, float value) {
        System.out.println("ConstructorParent constructor with 3 arguments.");
        this.currency = currency;
        this.country = country;
        this.value = value;
    }
}