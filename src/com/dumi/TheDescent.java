package com.dumi;
import java.util.Arrays;
import java.util.Scanner;

public class TheDescent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int hmax = 0;
            int hmax_index = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH > hmax) {
                    hmax = mountainH;
                    hmax_index = i;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("Highest mountain is " + hmax_index); // The index of the mountain to fire on.
        }
    }
}
