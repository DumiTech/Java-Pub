package com.dumi.OCAJSE8PI.C5ClassDesign.ImplementingInterfaces;

abstract interface HasTail {
    public abstract int getTailLength();
}

interface HasWhiskers {
    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers {
}

class LeopardSeal implements HasTail, HasWhiskers {
    @Override
    public int getTailLength() {
        return 5;
    }

    @Override
    public int getNumberOfWhiskers() {
        System.out.print("getNumberOfWhiskers = ");
        return 3;
    }
}


public class Main {
    public static void main(String[] args) {
        LeopardSeal leopardSeal = new LeopardSeal();
        System.out.println("getTailLength = " + leopardSeal.getTailLength());
        System.out.println(leopardSeal.getNumberOfWhiskers());
    }
}


