package com.sai.sorting.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateElementsCyclicSort {

    public static void main(String[] args) {
        //int[] arr = {3,0,1};
        // int[] arr = {1,1};
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
      //  int[] arr = {2,2};
        System.out.println(findAllMissingNumber(arr));
    }

    public static List<Integer> findAllMissingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        while (i < nums.length) {
            //if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
           /* } else {
                i++;
            }*/

        }



        //search for duplicates
        for(int index = 0; index < n ; index++){

            if(nums[index] != index +1 ){
                list.add(nums[index]);
            }
        }

        return list;

    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
