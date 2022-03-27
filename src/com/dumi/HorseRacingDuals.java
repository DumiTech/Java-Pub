package com.dumi;
import java.util.*;

//input: 3 5 8 9

public class HorseRacingDuals {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of horses: ");
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            arr[i] = pi;
        }

        Arrays.sort(arr);
        int min = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            if (arr[i] - arr[0] < min) {
                min = arr[i] - arr[0];
            } else if (arr[i] - arr[1] < min) {
                min = arr[i] - arr[1];
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(min);
    }
}
