package com.sai.recursion;

public class NThFibonocci {

    public static void main(String[] args) {
       System.out.println(fiboFormula(54));

        for (int i = 0; i < 55; i++) {
          //  System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n){
        return (int)((Math.pow(((1+ Math.sqrt(5)) / 2), n) - Math.pow(((1- Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    static int fibo(int n){

        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
