package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

public class ArrayType {
    public static void main(String args[]) {
//        String[] bugs = {"cricket", "beetle", "ladybug"};
//        String[] alias = bugs;
//        System.out.println(bugs.equals(alias));
//        System.out.println(bugs.toString());
//
//        System.out.println(java.util.Arrays.toString(bugs));
//
//        String names[] = new String[]{"S", "ss"};
//        names[0] = "ST";
//        names[1] = "STT";
//        System.out.println(java.util.Arrays.toString(names));
//
//        String[] strings = { "stringValue" };
//        Object[] objects = strings;
//        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
//        objects[0] = new StringBuilder(); // Error at runtime

//        String[] mammals = {"monkey", "chimp", "donkey"};
//        mammals[0] = "chimp";
//        System.out.println(mammals[0]);

        int[] numbers = new int[]{1,3,5,7,9};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 5;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
