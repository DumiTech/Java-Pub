package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation;

//import static java.util.Arrays; // DOES NOT COMPILE
//static import java.util.Arrays.*;  // DOES NOT COMPILE

import java.util.List;
import static java.util.Arrays.asList; // static import

public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // no Arrays.
        System.out.println(list);
    }
}
