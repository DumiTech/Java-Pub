package com.dumi.OCAJSE8PI.C1JavaBuildingBlocks;

public class Variables {

    static int STATIC_VARIABLE;
    int instanceVariable;
    private static Variables objClassLevel = new Variables();

    {
        System.out.println("Inside class level block, this is called when creating an object.");
    }

    static
    {
        System.out.println("Inside static block");
        Variables objStaticBlock = new Variables();
        objStaticBlock.instanceVariable = 11;
        System.out.println("Object static block variable: " + objStaticBlock.instanceVariable + "\n");
        System.out.println("Object class level: " + objClassLevel.instanceVariable);
    }

    public static void main(String[] args) {
        System.out.println("Static variable default value: " + STATIC_VARIABLE);

        Variables objMLevel = new Variables();
        System.out.println("Instance variable default value: " + objMLevel.instanceVariable);

        int localVariable = 3;
        System.out.println("\nLocal variable: " + localVariable);
    }
}