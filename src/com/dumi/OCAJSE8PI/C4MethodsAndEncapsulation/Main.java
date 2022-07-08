package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<String> values = new ArrayList<>();

    public static void run(int... nums) {
        System.out.println(nums[0]);
    }

    public static void main(String[] args) {
        run(11, 22, 33);
        run(new int[] {1,2});

        values.add("changed");
        values.add("exchanged");
        System.out.println(values);
    }
}
