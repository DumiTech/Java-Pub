package com.dumi.games;

public class TemperaturesGame {

    public static int computeClosestToZero(int[] ts) {
        if (ts.length == 0) {
            return 0;
        }

        int min = ts[0];

        for (int i = 1; i < ts.length; i++) {
            if (Math.abs(ts[i]) < Math.abs(min)) {
                min = ts[i];
            } else if (Math.abs(ts[i]) == Math.abs(min) && ts[i] > min ) {
                min = ts[i];
            }
        }

        return  min;
    }

    public static void main(String args[]) {

        int[] ts = { 101, -24, -5, 10, 3 };

        int result = computeClosestToZero(ts);
        System.out.println(result);
    }
}
