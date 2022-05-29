package com.dumi.OCAJSE8PI.C2OperatorsAndStatements;

public class WhileStatements {

    static int bitesOfCheese = 4;

    int roomInBelly = 5;
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
            System.out.println("Remaining bites of cheese: " + bitesOfCheese);
            System.out.println("Remaining room in belly: " + roomInBelly + "\n");
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }

    public static void main(String[] args) {
        WhileStatements obj = new WhileStatements();
        obj.eatCheese(bitesOfCheese);

        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + "\n\n");

        int x1 = 0;
        long y1 = 10;
        for(y1 = 0, x1 = 4; x1 < 5 && y1 < 10; x1++, y1++) {
            System.out.print(x1 + " ");
        }


    }
}
