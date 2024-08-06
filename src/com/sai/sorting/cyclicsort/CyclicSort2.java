package com.sai.sorting.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort2 {

    public static void main(String[] args) {
        //int[] arr = {5,2,1,4,3};
        //System.out.println(Arrays.toString(cyclicSort(arr)));

       // int[] arr = {2,0,1};
        //System.out.println(missingNum(arr));

        //int[] arr = {1,2};
        //System.out.println(allMissingNums(arr));

        int[] arr = {1,3,4,4,2,2};
        System.out.println(allDuplicateNumber(arr));
    }

    static int[] cyclicSort(int[] arr) {
        int start = 0;
        while(start < arr.length) {
            int correct = arr[start] - 1;
            if(arr[correct] != arr[start]) {
                swap(arr,correct,start);
            } else {
                start++;
            }
        }

        return arr;
    }


    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    //https://leetcode.com/problems/missing-number/description/
    static int missingNum(int[] arr) {
        int start = 0;
        int n = arr.length;
        while(start < n) {
            int correct = arr[start];
            if(correct < n && arr[correct] != arr[start]) {
                swap(arr,correct,start);
            } else {
                start++;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] != i){
                return i;
            }
        }
        //case:2[2,1,0]
        return n;
    }

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    static List<Integer> allMissingNums(int[] nums) {
        int start = 0;
        int n = nums.length;
        while(start < n) {
            int correct = nums[start] - 1;
            if(nums[correct] != nums[start]) {
                swap(nums,correct,start);
            } else {
                start++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int index = 0; index < n; index++){
            if(nums[index] != index + 1){
                result.add(index+1);
            }
        }

        return result;
    }

    //https://leetcode.com/problems/find-the-duplicate-number/description/
    static int duplicateNumber(int[] nums) {
        int start = 0;
        int n = nums.length;
        while(start < n) {
            // if element at the index not equals to index + 1.
            // Then check for element at the correct index.
            // If not same swap. Otherwise it is a duplciate
            if (nums[start] != start + 1) {
                int correct = nums[start] - 1;
                if (nums[correct] != nums[start]) {
                    swap(nums, correct, start);
                } else {
                    List<Integer> result = new ArrayList<>();
                    return nums[start];
                }
            } else {
               start++;
            }
        }

        return -1;
    }



    static List<Integer> allDuplicateNumber(int[] nums) {
        int start = 0;
        int n = nums.length;
        while (start < n) {
            // if element at the index not equals to index + 1.
            // Then check for element at the correct index.
            // If not same swap. Otherwise it is a duplciate
                int correct = nums[start] - 1;
                if (nums[correct] != nums[start]) {
                    swap(nums, correct, start);
                } else {
                    start++;
                }

        }


        List<Integer> result = new ArrayList<>();
        for(int index = 0; index < n; index++){
            if(nums[index] != index + 1){
                result.add(nums[index]);
            }
        }

        return result;
    }
}
