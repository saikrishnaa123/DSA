package com.sai.binarysearch;


public class Celing {

    public static void main(String[] args) {
        int[] arr = {2, 5, 15, 28, 45, 55, 68, 87};
       // System.out.println(celing(arr, 29));
      //  System.out.println(floor(arr, 29));
        char[] chars = {'b','d','f'};
        System.out.println(celingCharacters(chars,'a'));
    }

    //ceiling is smallest number that is greater than or equals to(>=) target
    public static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possible that (start + end) exceeds the limit of int
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return arr[mid];
            }

        }
        return start;
    }

    //ceiling is greatest number that is less than or equals to(<=) target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        /*if (target < arr[start]) {
            return -1;
        }*/
        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possible that (start + end) exceeds the limit of int
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return arr[mid];
            }

        }
        return end;
    }


    public static char celingCharacters(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possible that (start + end) exceeds the limit of int
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return arr[start % arr.length];
    }
}
