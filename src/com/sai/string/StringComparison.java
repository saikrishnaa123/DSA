package com.sai.string;

//import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;

public class StringComparison {

    public static void main(String[] args) {
    String a = "Sai";
    String b = "Sai";
    String c = a;
        System.out.println(a==c);
        String s = new String("Sai");
        String s2 = new String("Sai");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        float f = 435.12567f;
        //System.out.printf("%.2f",f);
        //System.out.printf("%.1f",Math.PI);
        //System.out.printf("My Name is %s %s","Sai","Krishna");
        System.out.println('a');
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println(new Integer(4) + "" +new ArrayList<>());
        StringBuilder sb =  new StringBuilder();
        for(int i = 0; i < 26; i++){
            char character = (char)('a' + i);
            sb.append(character);
        }

        System.out.println(sb.toString());

        String name = "Sai Krishna";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
    }


}
