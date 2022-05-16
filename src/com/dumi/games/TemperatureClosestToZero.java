package com.dumi.games;

import java.util.Scanner;

public class TemperatureClosestToZero {

    public static int parse(int number_of_temperatures, int[] arr) {

        if (number_of_temperatures == 0) {
            return 0;
        }

        int min = arr[0];

        for (int i = 1; i < number_of_temperatures; i++) {
            if (Math.abs(arr[i]) < Math.abs(min)) {
                min = arr[i];
            } else if (Math.abs(arr[i]) == Math.abs(min) && arr[i] > min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of temperatures to analyse: ");
        int number_of_temperatures = in.nextInt(); // the number of temperatures to analyse
        int[] arr = new int[number_of_temperatures];

        System.out.println("You have to type a number ranging from -273 to 5526 ");
        for (int i = 0; i < number_of_temperatures; i++) {
            System.out.print("Enter a number: ");
            int temp = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            arr[i] = temp;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        int result = parse(number_of_temperatures, arr);

        // System.err.println("Debug messages...");
        System.out.println(result);
    }
}