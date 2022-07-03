package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.duck;

import com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater();     // DOES NOT COMPILE
    }
}
