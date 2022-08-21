package com.dumi.leetcode;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */

public class ValidParentheses {
    public static void main(String[] args) {
//        String s = "()[]{}";
//        String s = "(]";
        String s = "{[]}";
        ValidParenthesesSol obj = new ValidParenthesesSol();
        System.out.println(obj.isStringValid(s));
    }
}

class ValidParenthesesSol {
    public boolean isStringValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s == "";
    }
}