package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.Predicates;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPredicateMethodParameter {
    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        bunnies.add("harry the rabbit");

        System.out.println(bunnies);
        bunnies.removeIf(s -> s.charAt(0) != 'h');
//        bunnies.removeIf(s -> s.toString() == "hoppy");
        System.out.println(bunnies);
    }
}
