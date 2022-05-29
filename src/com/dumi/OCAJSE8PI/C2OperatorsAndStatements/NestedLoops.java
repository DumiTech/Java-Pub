package com.dumi.OCAJSE8PI.C2OperatorsAndStatements;

public class NestedLoops {

    public static void main(String[] args) {
        int[][] myComplexArray =  {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

//        int[][] myComplexArray1 = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
//        OUTER_LOOP:  for(int[] mySimpleArray : myComplexArray1) {
//            INNER_LOOP:  for(int i=0; i<mySimpleArray.length; i++) {
//                System.out.print(mySimpleArray[i]+"\t");
//            }
//            System.out.println();
//        }
    }
}
