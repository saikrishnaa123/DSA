package com.sai.string;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        String name = "Sai Krishna";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.charAt(4));
        System.out.println("   sai   ".trim());  //use strip() from java11 to remove unicode white spaces
    }
}
