package com.dumi.OCAJSE8PI.C1JavaBuildingBlocks;

public class Mouse {
    static int MAX_LENGTH = 5; // class/static variable; scope: 4 to 11;
    int length; // instance variable; scope: 5 to 11;
    public void growth(int inches) { // method parameter aka local variable; scope: 6 to 11;
        if (length < MAX_LENGTH) {
            int newSize = length + inches; // local variable; scope: 8 to 10;
            length = newSize;
        }
    }
}