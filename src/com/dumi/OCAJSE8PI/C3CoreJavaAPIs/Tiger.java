package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;


public class Tiger {
    String name = "asd";
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        t2.name = "asdf";
        System.out.println(t1 == t1);
        System.out.println(t1 == t2);
        System.out.println(t1.name.equals(t2.name));


        int[] no = new int[3];
        for (int i : no) {
            System.out.print(i + ", ");
        }

        System.out.println();
        int[] no1 = {1, 2, 3};
        for (int i : no1) {
            System.out.print(i + ", ");
        }

    }
}
