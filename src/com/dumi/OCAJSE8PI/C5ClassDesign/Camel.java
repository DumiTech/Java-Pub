package com.dumi.OCAJSE8PI.C5ClassDesign;

public class Camel {
    protected String getNumberOfHumps() {
        return "Undefined";
    }
}


class BactrianCamel extends Camel {
//    private int getNumberOfHumps() {  // DOES NOT COMPILE
//        return 2;
//    }

    public static void main(String[] args) {
        System.out.println(new BactrianCamel().getNumberOfHumps());
    }
}