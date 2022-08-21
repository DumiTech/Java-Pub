package com.dumi.leetcode;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */

import java.util.Stack;

public class ValidParenthesesV2 {
    public static void main(String[] args) {
//        String s = "()[]{}";
//        String s = "(]";
        String s = "{[]}";
        ValidParenthesesSolV2 obj = new ValidParenthesesSolV2();
        System.out.println(obj.isStringValid(s));
    }
}

class ValidParenthesesSolV2 {
    public boolean isStringValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}