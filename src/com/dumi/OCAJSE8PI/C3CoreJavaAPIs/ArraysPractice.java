package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 10, 5};
        Arrays.sort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array hash: " + arr);
        System.out.println();

        String[] strings = { "10", "9", "100", "0999", "11111111" };
        Arrays.sort(strings);
        for (int i=0; i<strings.length; i++) {
            System.out.print(strings[i] + "; ");
        }
        System.out.println();

        for (String string : strings)
            System.out.print(string + "; ");
        System.out.println();


        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        String [][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

        // Asymmetric multidimensional array:
        int[][] args1 = new int[3][];
        args1[0] = new int[1];
        args1[1] = new int[3];

        for (int[] a: args1) {
            System.out.println(a);
        }
        System.out.println();


        int[][] twoD = new int[3][2];
        for (int i=0; i<twoD.length; i++) {
            for (int j=0; j<twoD[i].length; j++) {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Second method to output the 2D array:");
        for (int[] inner : twoD) {
            for (int num: inner) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}


