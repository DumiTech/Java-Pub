package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.LambdaExample;

public class CheckIfHopper implements CheckTrait{

    public boolean test(Animal a) {
        return a.canHop();
    }
}