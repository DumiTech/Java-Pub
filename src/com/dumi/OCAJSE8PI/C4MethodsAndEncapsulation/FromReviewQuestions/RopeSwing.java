package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.FromReviewQuestions;

public class RopeSwing {
    private static Rope1 rope1 = new Rope1();
    private static Rope1 rope2 = new Rope1();
    {
        System.out.println(rope1.length);
    }
    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
        System.out.println(rope1.hashCode());
        System.out.println(rope2.hashCode());
    }
}
