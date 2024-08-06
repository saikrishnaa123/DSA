package com.sai.sorting.cyclicsort;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,0,1};
       // cyclicSort(arr);
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        int noofElements = n + 1;
        while (i < nums.length) {
            int correct = nums[i];

           // if(correct < n ){
                if (correct < n && nums[i] != nums[correct]) {

                    swap(nums, i, correct);



            }else {
                i++;
            }





        }

        //search for first missing number
        for(int index = 0; index < n ; index++){
            if(nums[index] != index){
                return index;
            }
        }

        return n;
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                swap(arr, i, correct );
            }else {
                i++;
            }
        }

    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

   // class Solution {




}
