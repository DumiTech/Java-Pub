package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation;

public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    static { System.out.println("static initializer first"); }
    { System.out.println("instance initializer here"); }

    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        System.out.println("Print statement");
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}