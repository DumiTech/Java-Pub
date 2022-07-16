package com.dumi.OCAJSE8PI.C5ClassDesign;

public class OverridingVsHidingMethods {
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}

class Marsupial {
//    public static boolean isBiped() {
//        return false;
//    }
    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

class Kangaroo extends Marsupial {
//    public static boolean isBiped() { // hidden
//        return true;
//    }
    public boolean isBiped() { // overriden
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
}