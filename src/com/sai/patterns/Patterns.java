package com.sai.patterns;

public class Patterns {

    public static void main(String[] args) {
        printPatternLAst(4);
    }

    static void printPattern(int n){
        for(int row = 1; row <=n;row++){
            for(int col = 1; col <=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern2(int n){
        for(int row = 1; row <=n;row++){
            for(int col = 1; col <=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern3(int n){
        for(int row = 1; row <=n;row++){
            for(int col = 1; col <= n + 1 - row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern4(int n){
        for(int row = 1; row <=n;row++){
            for(int col = 1; col <= row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void printPattern5(int n){
        for(int row = 1; row < 2 * n;row++){
            for(int col = 1; col <= (row <= n ? row : 2*n - row) ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern6(int n){
        for(int row = 1; row < 2 * n;row++){
            int totalNoOfColumns = (row <= n ? row : 2*n - row);
            int totalNoOfspaces = n - totalNoOfColumns;
            for(int spaces = 1 ; spaces <= totalNoOfspaces; spaces++){
                System.out.print(" ");
            }
            for(int col = 1; col <= totalNoOfColumns ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void printPattern7(int n) {
        for(int row = 1; row <= n; row++){
            int totalNoOfColumns =  n - row;
            int totalNoOfspaces = n - totalNoOfColumns;
            for(int spaces = 1 ; spaces <= n - row; spaces++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row ;col++){
                System.out.print(row + " " + (row - 1) + " " + row);
            }
            System.out.println();
        }
    }


    static void printPatternd(int n){
        for(int i=1; i <=n;i++){
            for(int j=1; j <=n - i + i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPatternn(int n){
        for(int i=1; i <=n;i++){
            for(int j=1; j <= i; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
    }


    static void printPatternnn(int n){
        for(int i=0; i < 2 * n;i++){
            int noOfCol = i < n ? i : 2*n - i;
            for(int j=0; j < noOfCol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void printPatterSpaces(int n){
        for(int i=1; i <= n;i++){

         //   int noOfCol = i < n ? i : 2*n - i;
            for(int space=1; space <= n - i; space++){
                System.out.print("  ");
            }

            for(int j=i; j >=1; j--){
                System.out.print(j+ " ");
            }
            for(int k=2; k <=i; k++){
                System.out.print(k+ " ");
            }

            System.out.println();
        }
    }


    static void printPatterNums(int n){
        for(int row=1; row <= 2 * n;row++) {
            int noOfCol = row > n ? 2*n - row  : row;
            for(int space=0; space < n - noOfCol; space++){
                System.out.print("  ");
            }

            for(int j=noOfCol; j >=1; j--){
                System.out.print(j+ " ");
            }
            for(int j=2; j <=noOfCol; j++){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }

    static void printPatternLAst(int n){
        int originalN = n;
        n = 2*n;
        for(int row = 0; row <=n;row++){
            for(int col = 0; col <=n;col++){
                int colAtIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(colAtIndex + " ");
            }
            System.out.println();
        }
    }


}

/*
1-1  9 - 1 = 8 - 7  -> 1 + 6
2-2  9 - 2 = 7 - 5  - > 2 + 3
3-3  9 - 3 = 6 - 3  - > 3 + 0
4-4  9 - 4 = 5 - 1  -> 4 -3
5-5  9 - 5 = 4 + 1   -> 5 + 0
6-4  9 - 6 = 3 + 1  -> 4 -3
7-3  9 - 7 = 2 + 1
8-2  9 - 8 = 1 + 1
9-1  9 - 9 = 0 + 1 n - r + 1
4 + 2 2 * 1
        3 + 4 2 * 2
        2 + 6 2 * 3

*
**
***
****
*****
****
***
**
**/


