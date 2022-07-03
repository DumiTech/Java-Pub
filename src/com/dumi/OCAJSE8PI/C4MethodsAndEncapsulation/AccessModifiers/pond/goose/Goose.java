package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.goose;

import com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater(); // DOES NOT COMPILE
//        System.out.println(other.text); // DOES NOT COMPILE
    }
}
