package com.dumi.OCAJSE8PI.C5ClassDesign;

class InsufficientDataException extends Exception {}

public class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    protected double getWeight() throws Exception {
        return 2;
    }
}

class Snake extends Reptile {
    protected boolean hasLegs() {
        return false;
    }
    // is permitted, as InsufficientDataException is a subclass of Exception by construction
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }

    public static void main(String[] args) throws InsufficientDataException {
        System.out.println(new Snake().hasLegs());
        System.out.println(new Snake().getWeight());
    }
}
