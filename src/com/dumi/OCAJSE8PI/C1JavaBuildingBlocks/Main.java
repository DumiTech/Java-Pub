package com.dumi.OCAJSE8PI.C1JavaBuildingBlocks;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Joe";

        System.out.println(animal.getName());
        animal.setName("Jimmy");
        System.out.println(animal.name);

        System.out.println(Test.test());

        System.out.println(Zoo.zooMethod());

    }
}

class Test {
    public static String test() {
        String test = "test";
        return test;
    }
}