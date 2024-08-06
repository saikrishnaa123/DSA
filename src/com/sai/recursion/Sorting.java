package com.sai.recursion;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        selectionSortRecursion2(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    static int[] bubbleSortRecursion(int[] arr, int i, int j) {

        if (i == arr.length - 1) {
            return arr;
        }
            if (j < arr.length - i) {
                if( arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                    return bubbleSortRecursion(arr, i, j + 1);
                } else {
                    return bubbleSortRecursion(arr, i, j + 1);
                }

            } else {
                return bubbleSortRecursion(arr, i + 1, 1);
            }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



    static void bubbleSortRecursion2(int[] arr, int i, int j) {

        if (i == 0) {
            return ;
        }
        if (j < i) {
            if( arr[j + 1] < arr[j]){
                swap(arr, j, j + 1);
            }
            bubbleSortRecursion(arr, i, j + 1);

        } else {
            bubbleSortRecursion(arr, i - 1, 0);
        }
    }



    static void selectionSortRecursion2(int[] arr, int row, int column, int max) {

        if (row == 0) {
            return;
        }
        if (column < row) {
            if( arr[max] > arr[column]){
                selectionSortRecursion2(arr, row, column + 1, max);
            } else {
                selectionSortRecursion2(arr, row, column + 1, column);
            }


        } else {
            swap(arr, row -1, max);
            selectionSortRecursion2(arr, row - 1, 0, 0);
        }
    }
}
