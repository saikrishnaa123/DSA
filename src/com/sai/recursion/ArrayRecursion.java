package com.sai.recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayRecursion {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 5};
        //   System.out.println(arrSorted(nums, 0));
        System.out.println(linearSearch(nums, 0, 6));
        System.out.println(linearSearchLast(nums, nums.length - 1, 6));
        System.out.println(linearSearchList(nums, 0, 5, new ArrayList<>()));
        System.out.println(linearSearchListWay(nums, 0, 5));
    }


    static boolean arrSorted(int[] arr, int j) {
        //int i = 0;
        if (j == arr.length - 1) {
            return true;
        }
        /*if(arr[j] < arr[j + 1]){
            return arrSorted(arr, j + 1);
        }

        return false;*/

        return arr[j] < arr[j + 1] && arrSorted(arr, j + 1);
    }


    static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, index + 1, target);
    }


    static int linearSearchLast(int[] arr, int index, int target) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return linearSearchLast(arr, index - 1, target);
    }

    static boolean findLinearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || findLinearSearch(arr, index + 1, target);
    }


    static ArrayList<Integer> linearSearchList(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return linearSearchList(arr, index + 1, target, list);
    }


    static ArrayList<Integer> linearSearchListWay(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> elements = linearSearchListWay(arr, index + 1, target);
        if (!elements.isEmpty()) {
            list.addAll(elements);
        }
        return list;
    }

    static int rotatedBS(int[] arr, int target, int s, int e) {
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if (target == arr[m]) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target <= arr[m] && target >= arr[s]) {
                return rotatedBS(arr, target, s, m - 1);
            } else {
                return rotatedBS(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return rotatedBS(arr, target, m + 1, e);
        }
        return rotatedBS(arr, target, s, m - 1);

    }
}
