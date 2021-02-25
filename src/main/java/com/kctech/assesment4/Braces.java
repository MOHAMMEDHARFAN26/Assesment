package com.kctech.assesment4;

import java.util.Deque;
import java.util.LinkedList;
public class Braces {
    public static void main(String[] args) {
String[] expressions= {"[]","[()]","{[]}","[}","[(}]","[]{}[]","()(}{}","()","{()[]}"};
for (String expr : expressions) {
            if (isValid(expr))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

    public static char close(char c) {
        switch (c) {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                throw new IllegalArgumentException(String.valueOf(c));
        }
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                break;
                default:
                    if (stack.isEmpty() || c != close(stack.pop()))
                        return false;
                break;
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

}

