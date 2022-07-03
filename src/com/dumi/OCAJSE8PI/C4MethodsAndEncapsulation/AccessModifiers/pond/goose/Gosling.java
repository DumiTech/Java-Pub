package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.goose;

import com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}
