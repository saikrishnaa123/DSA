package com.sai.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class StackBrackets {

    public static boolean areBracketsClosedInOrder(String str) {
        Stack<Character> stack = new Stack<>();
        char[] openingBrackets = {'(', '{', '['};
        char[] closingBrackets = {')', '}', ']'};
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : str.toCharArray()) {
            if (Arrays.binarySearch(openingBrackets, c) >= 0) {
                stack.push(c);
            } else if (Arrays.binarySearch(closingBrackets, c) >= 0) {
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string1 = "aad(ui{lo}iou(op)iu)";
        String string2 = "aad(ui{l(o}iouop)iu)";

        System.out.println(areBracketsClosedInOrder(string1)); // Output: true
        System.out.println(areBracketsClosedInOrder(string2)); // Output: false
    }
}
