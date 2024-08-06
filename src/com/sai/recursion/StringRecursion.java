package com.sai.recursion;

public class StringRecursion {

    public static void main(String[] args) {
        System.out.println(skipApple("bcappleccpa"));
    }

    //skip all a in a string

    static void skip(String p, String unp) {
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);

        if(ch == 'c') {
            skip(p,unp.substring(1));
        } else {
            skip(p + ch, unp.substring(1));
        }
    }


    static String skip(String unp) {
        if(unp.isEmpty()){
            return "";
        }
        char ch = unp.charAt(0);

        if(ch == 'a') {
            return skip(unp.substring(1));
        } else {
            return ch + skip(unp.substring(1));
        }
    }


    static String skipApple(String unp) {
        if(unp.isEmpty()){
            return "";
        }
        char ch = unp.charAt(0);

        if(unp.startsWith("apple")) {
            return skipApple(unp.substring(5));
        } else if(unp.startsWith("app")){
                return skipApple(unp.substring(3));
        } else {
            return ch + skipApple(unp.substring(1));
        }

    }
}
