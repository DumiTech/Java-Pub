package com.dumi.games;

import java.util.*;
import java.io.*;
import java.math.*;


public class Player {
    private static final int secret_atm_password = 1234;


    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = myObj.nextLine();

        System.out.println("Enter your ATM password: ");
        int atm_password = myObj.nextInt();


        if (atm_password == secret_atm_password) {
            System.out.println("Welcome back " + username + "!");
        } else if (atm_password != secret_atm_password) {
            System.out.println("Bad ATM password: ");
        }



//        while (true) {
//            String enemy1 = in.next(); // name of enemy 1
//            int dist1 = in.nextInt(); // distance to enemy 1
//            String enemy2 = in.next(); // name of enemy 2
//            int dist2 = in.nextInt(); // distance to enemy 2
//
//
//            System.out.println(enemy1);
//            System.out.println(dist1);
//            System.out.println(enemy2);
//            System.out.println(dist2);
//
//
//            // Write an action using System.out.println()
//            // To debug: System.err.println("Debug messages...");
//
//
//            // You have to output a correct ship name to shoot ("Buzz", enemy1, enemy2, ...)
//            System.out.println("name of the enemy");
//        }
    }
}
