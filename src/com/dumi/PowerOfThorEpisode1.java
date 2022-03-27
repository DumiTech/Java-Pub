package com.dumi;
import java.util.*;

/*
test cases:

Game information:
Thor's ready to go.
Thor position = (5,4). Light position = (31,4). Energy = 100

Game information:
Thor's ready to go.
Thor position = (31,17). Light position = (31,4). Energy = 13

Game information:
Thor's ready to go.
Thor position = (31,4). Light position = (0,17). Energy = 44

Game information:
Thor's ready to go.
Thor position = (0,0). Light position = (36,17). Energy = 36

A single line providing the move to be made: N NE E SE S SW W or NW
*/


public class PowerOfThorEpisode1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String north = "N";
            String south = "S";
            String east = "E";
            String west = "W";
            String northEast = "NE";
            String northWest = "NW";
            String southEast = "SE";
            String southWest = "SW";

            for (int i = 0; i < remainingTurns; i++) {
                if (lightX > initialTx && lightY > initialTy) {
                    initialTx++;
                    initialTy++;
                    System.out.println(southEast);
                } else if (lightX < initialTx && lightY < initialTy) {
                    initialTx--;
                    initialTy--;
                    System.out.println(northWest);
                } else if (lightX > initialTx && lightY < initialTy) {
                    initialTx++;
                    initialTy--;
                    System.out.println(northEast);
                } else if (lightX < initialTx && lightY > initialTy) {
                    initialTx--;
                    initialTy++;
                    System.out.println(southWest);
                } else if (lightX > initialTx) {
                    initialTx++;
                    System.out.println(east);
                } else if (lightX < initialTx) {
                    initialTx--;
                    System.out.println(west);
                } else if (lightY > initialTy) {
                    initialTy++;
                    System.out.println(south);
                } else if (lightY < initialTy) {
                    initialTy--;
                    System.out.println(north);
                }
            }
        }
    }

}
