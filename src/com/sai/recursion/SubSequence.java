package com.sai.recursion;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
       // subSequence("","abc");
       // System.out.println(subSequenceList("", "abc", new ArrayList<>()));
        //System.out.println(subSequenceList("", "abc"));
        subSequenceAscii("", "abc");
    }

    static void subSequence(String p, String unp) {
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        subSequence(p + ch,unp.substring(1)) ;
        subSequence(p,unp.substring(1));
    }

    static ArrayList<String> subSequenceList(String p, String unp) {
        if(unp.isEmpty()) {
            ArrayList<String> list3 = new ArrayList<>();
            list3.add(p);
            return list3;
        }
        char ch = unp.charAt(0);
        ArrayList<String> lis1 = subSequenceList(p + ch,unp.substring(1));
        ArrayList<String> lis2 = subSequenceList(p,unp.substring(1));
        lis2.addAll(lis1);
        lis2.remove("");
        return lis2;
    }

    static ArrayList<String> subSequenceList(String p, String unp, ArrayList<String> list) {
        if(unp.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);
        ArrayList<String> lis1 = subSequenceList(p + ch, unp.substring(1), list);
        subSequenceList(p,unp.substring(1), lis1);
        list.remove("");
        return list;
    }


    static void subSequenceAscii(String p, String unp) {
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        subSequenceAscii(p + ch,unp.substring(1)) ;
        subSequenceAscii(p,unp.substring(1));

        subSequenceAscii(p + (ch + 0),unp.substring(1));
    }
}
