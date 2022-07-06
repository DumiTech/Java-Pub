package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation;

public class PassingDataAmongMethods {
    public static void main(String[] args) {
        int num = 5;
        newNumber(3);
        System.out.println(num);

        String name = "Berlin";
        speak(name);
        System.out.println(name);

        StringBuilder nam3 = new StringBuilder();
        sp3ak(nam3);
        System.out.println(nam3);

        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2);

        int number = 1;
        String letters = "abc";
        number(number);
        letters = letters(letters);
        System.out.println(number + letters);
    }

    public static void newNumber(int num) {
        num = 3;
    }

    public static String speak(String name) {
        name = "London";
        return name;
    }

    public static void sp3ak(StringBuilder nam3) {
        nam3.append("Paris");
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
