package com.sai.sorting.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedNoOfArrayGoogleQuestionforClyclicSort {

    public static void main(String[] args) {
        //int[] arr = {3,0,1};
        int[] arr = {1,1};
        System.out.println(findAllMissingNumber(arr));
    }
    public static List<Integer> findAllMissingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (correct < n &&  nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else {
                i++;
            }
        }

        //search for first missing number
        for(int index = 0; index < n ; index++){
           // int correct = nums[index]-1;
            if(nums[index] != index + 1){
                list.add(index + 1);
            }
        }
        if(!list.isEmpty()){
            return list;
        }
        list.add(n);
        return list;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
