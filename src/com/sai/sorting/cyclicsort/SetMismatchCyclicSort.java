package com.sai.sorting.cyclicsort;

import java.util.Arrays;

public class SetMismatchCyclicSort {
    public static void main(String[] args) {
        //int[] arr = {4,3,2,1,2,6,5};
        int[] arr = {2,2,3};
        System.out.println(Arrays.toString(findMissingAndDuplicate(arr)));

    }

    public static int[] findMissingAndDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};

            }
        }

        return  new int[]{-1,-1};
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
