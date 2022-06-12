package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

public class StringMethods {
    public static void main(String[] args) {
        String s = "s";
        String s1 = new String("s1");

        System.out.println(1 + "D" + 2 + "c");

        s += "as";
        System.out.println(s);
        String s11 = "String 1";
        String s2 = s11.concat("String 2");
        s2.concat("3");
        System.out.println("s2 length: " + s2.length());
        System.out.println("s2.charAt(1): " + s2.charAt(1));

//        String animal = "animal";
//        System.out.println(animal.indexOf('a'));
//        System.out.println(animal.indexOf("a"));
//        System.out.println(animal.indexOf("a", 3));
//        System.out.println(animal.substring(4));
//        System.out.println(animal.substring(animal.indexOf("m")));
//        System.out.println(animal.substring(3, 4));
//        System.out.println(animal.substring(3, 6));

        String string = "animals";
        string.toUpperCase();
        System.out.println(string);

        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        System.out.println();
        System.out.println(string.startsWith("a"));

        System.out.println(string.contains("al"));

        System.out.println();
        System.out.println(string.replace('a', 'A'));
        System.out.println(string.replace("an", "k"));

        System.out.println("\t   a b c\n".trim());
        System.out.println("\r   a b c\n".trim());

        String result = "AniMaL   ".trim().toLowerCase().replace("an", "An");
        System.out.println(result);
    }
}
