package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation;

public class Encapsulation {

    private Encapsulation() {}

    private int numberEggs;

    public int getNumberEggs() {
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {
        if (numberEggs >= 0) {
            this.numberEggs = numberEggs;
        }
    }

    {
        setNumberEggs(5);
        System.out.println(getNumberEggs());
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setNumberEggs(3);
        System.out.println(obj.numberEggs);
    }
}
