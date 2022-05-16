package com.dumi.OCAJSE8PI.AssessmentTest;

import java.util.ArrayList;
import java.util.List;

public class AssessmentTest {
    public static void main(String[] args) {
        ex7();
    }

    public static void playground() {
        int i = 0;
        System.out.println("++i = " + ++i);
        System.out.println("  i = " + i + "\n");

        i = 0;
        System.out.println("i++ = " + i++);
        System.out.println("  i = " + i);
    }

    public static void ex2() {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println("Default objects hash codes: ");
        System.out.println("s1: " + System.identityHashCode(s1));
        System.out.println("s2: " + System.identityHashCode(s2));
        System.out.println("sb1: " +System.identityHashCode(sb1));
        System.out.println("sb1.toString(): " + System.identityHashCode(sb1.toString()));
        System.out.println();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }

    public static void ex5() {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
                System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }

    public static void ex7() {
        int[] array = {6,9,8};
//        int[] array = new int[] {};
//        array = new int[]{6, 9, 8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }
}

