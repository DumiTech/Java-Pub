package com.dumi.OCAJSE8PI.AssessmentTest;

import java.util.ArrayList;
import java.util.List;

//public interface CanSwim {}
interface CanSwim {}

//public class Amphibian implements CanSwim {}
class Amphibian implements CanSwim {}


class Tadpole extends Amphibian {}

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();

        for(Amphibian amphibian : tadpoles) {
            CanSwim tadpole = amphibian;
            Amphibian tadpole2 = amphibian;
            Object tadpole3 = amphibian;
        }
    }
}
