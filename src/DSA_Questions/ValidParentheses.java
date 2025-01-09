package DSA_Questions;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        char ch = s.charAt(0);
//        if (ch == '(' || ch == '[' || ch == '{') {
//            stack.push(ch);
//        } else {
//            return false;
//        }
        for (int i = 0; i < length; i++) {
            ch = s.charAt(i);
            if (stack.isEmpty()) {
                if (ch == ')' || ch == ']' || ch == '}') {
                    return false;
                }
            }
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (ch == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else
                    return false;
            }

            if (ch == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else
                    return false;
            }

            if (ch == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else
                    return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "()[]{}"; // true
        String s2 = "()"; // true
        String s3 = "([])"; // true
        String s4 = "(]"; //false
        String s5 = "()[]}{"; // false
        String s6 = "["; // false

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
        System.out.println(isValid(s6));
    }
}
