package com.sai.recursion;

public class Patterns {
    public static void main(String[] args) {
        patternRecursion2(0,4);
    }

    static void patternRecursion(int col, int row){
        if(row == 0) {
            return;
        }
        if(col < row){
            System.out.print("* ");
            patternRecursion(col + 1, row);
        } else {
            System.out.println();
            patternRecursion(0, row - 1);
        }

    }


    static void patternRecursion2(int col, int row){
        if(row == 0) {
            return;
        }
        if(col < row){
            patternRecursion2(col + 1, row);
            System.out.print("* ");
        } else {
            patternRecursion2(0, row - 1);
            System.out.println();
        }

    }
}
