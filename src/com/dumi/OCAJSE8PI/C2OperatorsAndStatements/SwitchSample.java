package com.dumi.OCAJSE8PI.C2OperatorsAndStatements;

public class SwitchSample {

    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 0; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue ;
                    System.out.print(" " + a + x);
            }
        }

        System.out.println();
        boolean a, b;
        a = true;
        b = true;
        if (!a == !b) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

    }
}
