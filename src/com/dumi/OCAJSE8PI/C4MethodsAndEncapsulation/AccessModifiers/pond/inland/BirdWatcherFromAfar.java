package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.inland;

import com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation.AccessModifiers.pond.shore.Bird;

public class BirdWatcherFromAfar{
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.println(bird.text); // DOES NOT COMPILE
    }
}