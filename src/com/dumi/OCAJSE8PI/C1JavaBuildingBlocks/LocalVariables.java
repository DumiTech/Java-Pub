package com.dumi.OCAJSE8PI.C1JavaBuildingBlocks;

public class LocalVariables {


    public static void main(String[] args) {
        findAnswer(1==1);
    }

    public static void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}
