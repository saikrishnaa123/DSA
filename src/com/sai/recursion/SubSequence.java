package com.sai.recursion;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
       // subSequence("","abc");
       // System.out.println(subSequenceList("", "abc", new ArrayList<>()));
        //System.out.println(subSequenceList("", "abc"));
      //  subSequenceAscii("", "abc");
        int[] arr = {1,2,3};
        System.out.println(returnArrayList(arr));
    }
    // Refer the incomplete code to revise 
    /*static ArrayList<ArrayList<Integer>> returnArrayList(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(Integer num : arr) {
            ArrayList<Integer> inner = new ArrayList<>();
           *//* inner1.add(num);
            outer.add(inner1);*//*
            for(int i = 0; i <= outer.size();i++){
                inner.add(arr[i]);
                // ArrayList<Integer> inner = new ArrayList<>();
                //inner.add(num);
                //inner.add(arr[i]);
                //  outer.add(inner);
          *//*  for(int i = 0; i < arr.length - 1;i++){
                ArrayList<Integer> arrayListt = new ArrayList<>();
                arrayListt.add(arr[i]);
                if(!outer.contains(arrayListt)){
                    //arrLit.get(i).add(arr[i]);
                    outer.add(arrayListt);
                }*//*
                // arrayList.add(arr[])
              *//*  ArrayList<Integer> arrayList2 = new ArrayList<>();
                arrayList2.add(arr[i]);
                arrLit.add(arrayList2);
                arrLit.get(i).add(arr[i]);*//*
            }
        }
        return outer;
    }*/

    static ArrayList<ArrayList<Integer>> returnArrayList(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(Integer num : arr) {
            int n = outer.size();
            for(int i = 0; i < n;i++){
                //taking the copy of the lists inside the outer list to add the num to it.
                //suppose outer = [], [1] then we have to take the copy so that original will not get modified
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
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
