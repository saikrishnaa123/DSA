package com.sai.string;

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeFor("abcba"));
    }

    static String isPalindrome(String name) {
        if (name == null || name.isEmpty()) {
            return "empty string";
        }
        int start = 0;
        int end = name.length() - 1;
        while (start <= end) {
            if (name.charAt(start) != name.charAt(end)) {
                System.out.printf("String %s %s", name, "is not palindrome");
                return "not palindrome";
            }
            start++;
            end--;
        }

        System.out.printf("String %s %s", name, "is palindrome");
        return "Palindrome";
    }


    static String isPalindromeFor(String name) {
        if (name == null || name.isEmpty()) {
            return "empty string";
        }
        name = name.toLowerCase();
        for (int i = 0; i <= name.length() / 2; i++) {
            char charStart = name.charAt(i);
            char charEnd = name.charAt(name.length() - 1 - i);
            if (charStart != charEnd) {
                return "not palindrome";
            }
        }

        return "palindrome";
    }
}
