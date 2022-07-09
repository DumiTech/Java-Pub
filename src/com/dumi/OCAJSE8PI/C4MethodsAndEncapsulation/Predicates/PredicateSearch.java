package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.Predicates;

import com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.LambdaExample.Animal;

import java.util.ArrayList;
import java.util.List;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("cat", true, false));
        animals.add(new Animal("dog", true, true));

        print(animals, a -> a.canHop());

        System.out.println(animals.get(0));
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}