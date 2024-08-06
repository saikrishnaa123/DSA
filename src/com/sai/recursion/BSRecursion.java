package com.sai.recursion;

public class BSRecursion {
    public static void main(String[] args) {
      int[] arr = {1, 5, 8, 34, 67, 87};
      System.out.println(bSRecursion(arr, 87, 0, arr.length-1));
    }

    static int bSRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return bSRecursion(arr, target, start, mid - 1);
        }
        return bSRecursion(arr, target, mid + 1, end);
    }
}
