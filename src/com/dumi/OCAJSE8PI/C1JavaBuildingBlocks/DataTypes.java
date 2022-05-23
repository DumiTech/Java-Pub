package com.dumi.OCAJSE8PI.C1JavaBuildingBlocks;

import java.util.Date;

public class DataTypes {

    public static void main(String[] args) {
        Date today, today2; // declaring multiple variables in the same statement
        Date dateTest = new Date();
        Date objectCreationTest = new Date();

        logo();
        System.out.println("   Reference types \n");
        System.out.println("Objects\n");
        today = new Date();
        System.out.println("today: " + today);
        System.out.println("today.hashCode(): " + today.hashCode() + "\n");

        today2 = new Date();
        System.out.println("today2: " + today2);
        System.out.println("today2.hashCode(): " + today2.hashCode() + "\n");

        System.out.println("Comparing the hashes of the today with today2: ");
        String objCompare = (today == today2) ? "Same hash code" : "Not the same hash code";
        System.out.println(objCompare);

        // Try to comment the lines where you printed out the values and the hashes for the today
        // and today2 and this statement will return true instead of false
        // or just comment the values for one object
        System.out.println("\nComparing the values of the today and today2: ");
        System.out.println(today.equals(today2));

        Date today3 = new Date();
        System.out.println("\nBonus*\ntoday3: " + today3);
        System.out.println("today3.hashCode(): " + today3.hashCode());
        System.out.println("Comparing today2 with today3: ");
        String objCompare1 = (today2 == today3) ? "\nSame hash code" : "Not the same hash code";
        System.out.println(objCompare1);
        System.out.println(today2.equals(today3)+"\n");
        System.out.println();
        logo();

        System.out.println("Strings\n");
        String greeting;
        greeting = "Hey";
        String greet = "Hey";
        System.out.println("\ngreeting.hashCode(): " + greeting.hashCode());
        System.out.println("greet.hashCode(): " + greet.hashCode());
        System.out.println("\nComparing the hashes of the greeting and greet: ");
        String s = (greeting == greet) ? "Same hash in memory" : "Not the same hash in memory";
        System.out.println(s);

        System.out.println("\nComparing the values of the greeting and greet: ");
        System.out.println(greeting.equals(greet));

//          Chicken chicken = new Chicken();
//        Chicken chicken1 = new Chicken("Rosseta");
//        Chicken chicken2 = new Chicken("Ricky", "R");
//
//        System.out.println(chicken2.surname);
//
//        {
//            System.out.println("\nThis is an instance initializer.\n");
//        }

//        System.out.println(args);

    }

    public static void logo() {
        String logo = "#";
        for (int i = 0; i < 70; i++) {
            System.out.printf(logo);
        }
        System.out.println();
    }
}
