package com.sai.sorting.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementsCyclicSort {

    public static void main(String[] args) {
        //int[] arr = {3,0,1};
       // int[] arr = {1,1};
        int[] arr = {1,3,4,2,2};
        System.out.println(findAllMissingNumber(arr));
    }
    public static int findAllMissingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        while (i < nums.length) {
            if(nums[i] != i + 1){
                int correct = nums[i]-1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }else {

                    return nums[i];
                }
            } else {
               i ++;
            }

        }


        // other way if you don't put             if(nums[i] != i + 1){ above
        //search for first missing number
        /*for(int index = 0; index < n ; index++){
             int correct = nums[index]-1;
            if(index > 0 && nums[index] == nums[correct] && nums[index] != index + 1){
                list.add(nums[index]);
            }
        }*/

            return -1;

    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
