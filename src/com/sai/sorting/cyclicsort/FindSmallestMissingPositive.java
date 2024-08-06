package com.sai.sorting.cyclicsort;

public class FindSmallestMissingPositive {

    public static void main(String[] args) {
        int[] arr = {-1,3,1,4};
        System.out.println(findMissingAndDuplicate(arr));
    }

    public static int findMissingAndDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //search for first missing positive
        for(int index = 0; index < nums.length ; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }

        return  nums.length + 1;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
