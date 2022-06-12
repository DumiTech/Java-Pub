package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

public class StringBuilderPractice {
    public static void main(String[] args) {

        // an inefficient method (because Strings are immutable):
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;   // a total of 27 objects are instantiated,
        // most of them being immediately eligible for garbage collection
        System.out.println(alpha);

        // better approach (because StringBuilder are mutable):
        StringBuilder alpha1 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha1.append(current);
        System.out.println(alpha1);


        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);


        StringBuilder str = new StringBuilder();
        str.append("homo sapiens");
        System.out.println(str);

        StringBuilder sb3 = new StringBuilder(1);
        sb3.append(1).append(1).append("ASDASDASD");
        sb3.append("as").append("as");
        System.out.println(sb3);

        StringBuilder sbb = new StringBuilder("animals");
        String sub = sbb.substring(sbb.indexOf("a"), sbb.indexOf("al"));
        int len = sbb.length();
        char ch = sbb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
        System.out.println(sbb);

        StringBuilder stb = new StringBuilder("animals");
        stb.insert(7, "***");
        stb.insert(0, "***");
        stb.insert(3, " ");
        stb.insert(11, " ");
        System.out.println(stb);

        StringBuffer sbuf = new StringBuffer("ABCDEF");
        sbuf.append("GH");
        System.out.println(sbuf);

        //Understanding Equality
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two);
        System.out.println(one == three);

        //String equality & the way the JVM reuses String literals
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);
        //Strings are immutable and literals are pooled. The JVM created only
        //one literal in memory. x and y both point to the same location in memory

        String xx = "Hello World";
        String zz = " Hello World".trim(); // computed at runtime
        System.out.println(xx == zz);

        String hello_world = new String("Hello World"); // requesting a different String object
        String hello_world2 = "Hello World";
        System.out.println(hello_world == hello_world2); // the pooled value isn’t shared.

        // logical equality rather than object equality:
        String x1 = "Hello World";
        String z1 = " Hello World".trim();
        System.out.println(x1.equals(z1));
    }
}
