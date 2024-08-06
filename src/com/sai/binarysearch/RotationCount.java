package com.sai.binarysearch;

public class RotationCount {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int pivot =  findPivot(nums);
        System.out.println(rotationCount(nums));

    }
static int rotationCount(int[] nums){
        int pivot = findPivot(nums);
        return pivot + 1;
}
    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //3,4,5,6,7,0,1,2 if m = 7
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }


            //3,4,5,6,7,0,1,2 if m = 7
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //..........4,5,6,3,2,1,0.......... s = 4, m = 3
            // if mid <= start then it is proved that all elements  after mid will also be smaller and greater elements will be in before mid itself.
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                //3,4,5,6,2  s = 3 and m = 5
                //if start < mid, then more bigger numbers are lying over a head of mid. because if mid is pivot then it would have been cought in first and second if conditins so it will be just start will be less than mid and mid will not be exact higher number altogether.
                start = mid + 1;
            }

        }

        return -1;
    }



    static int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //3,4,5,6,7,0,1,2 if m = 7
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //skip the duplicates
                //MOTE : what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[start] > arr[start] + 1){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(arr[end] > arr[end - 1]){
                    return end -1;
                }
                end--;
            }
            //left side is sroted  and pivot will be in right
            //3,4,5,3,6,1,2
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return -1;
    }
}
