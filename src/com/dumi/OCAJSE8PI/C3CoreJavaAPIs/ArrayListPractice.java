package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.Float.valueOf;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = list2;
        System.out.println(list3);
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        List<String> list6 = new ArrayList<>();

        ArrayList list = new ArrayList();
        list.add("test");
        list.add(Boolean.TRUE);
        System.out.println(list);

        List<String> list10 = new ArrayList<>();
        list10.add("qwerty");
        list10.add("justa10");
        list10.add(0, "first");
        System.out.println(list10);

        list10.add("justa10");
        System.out.println(list10.remove("justa10"));
        System.out.println(list10.remove(0));
        System.out.println(list10);

        ArrayList<Object> arrL = new ArrayList<>();
        arrL.add(12);
        arrL.add("12");
        arrL.set(0, 0);
        System.out.println("\n{\n\"ArrayList size\": " + arrL.size() + ",\n" + "\"ArrayList value\": " + arrL + "\n}");


        System.out.println("\nIs arrL empty? " + arrL.isEmpty());
        arrL.clear();
        System.out.println(arrL);

        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("lion");
        animalList.add("hawk");
        boolean isContainingLion = animalList.contains("lion");
        System.out.println("The list is containing lion? " + isContainingLion);
        boolean isContainingSnake = animalList.contains("snake");
        System.out.println("The list is containing snake? " + isContainingSnake);

        System.out.println("animalList.equals(arrL): " + animalList.equals(arrL));


        int primitive = Integer.parseInt("1234");
        System.out.println(primitive);
        Integer wrapper = Integer.valueOf("12345");
        System.out.println(wrapper);

        float fl = Float.parseFloat("1.1");
        System.out.println(fl);
        Float fl1 = valueOf("2.2");
        System.out.println(fl1);

        // Autoboxing
        List<Float> weights = new ArrayList<>();
        weights.add(50.1f);
        weights.add(valueOf(100.1f));
        weights.remove(1);
        float first = weights.get(0);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        numbers.remove(new Integer(2));
        System.out.println(numbers);

    }
}