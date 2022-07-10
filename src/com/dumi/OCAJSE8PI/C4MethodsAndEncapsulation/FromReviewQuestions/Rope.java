package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.FromReviewQuestions;

public class Rope {
    public static void swing() {
        System.out.print("swing ");
    }
    public void climb() {
        System.out.println("climb ");
    }
    public static void play() {
        swing();
//        climb();
    }
    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
    }
}
