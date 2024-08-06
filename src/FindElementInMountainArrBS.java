//https://leetcode.com/problems/find-in-mountain-array/
public class FindElementInMountainArrBS {
    public static void main(String[] args) {

        int[] nums = {5, 7, 8, 6, 4};
        int target = 6;
        System.out.println(elementInMountainArray(nums, target));

    }


    static int elementInMountainArray(int[] nums, int target){
        int peak = peakIndexInMountainArray(nums);
        int firstTry = orderAgnosticBS(nums, target, 0, peak);
        if(firstTry != -1){
            return peak;
        }
        return orderAgnosticBS(nums, target, peak + 1, nums.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                // you are in descending part of the array
                //this may also be the greatest number(answer). keep looking left
                //This is why end != mid -1
                end = mid;
            } else {
                //you are in asc part of the array
                //because we know that mid + 1 element is greater than mid element.

                start = mid + 1;
            }
        }
        //In the end , start == end and pointing to the largest number because of the above 2 checks.
        //start and end are always trying to find max element in the above 2 checks
        //hence when they are pointing to just one element, that is the max one . Because that is what the check says.
        //AT every point of time for start and end , they have the best possible maximum number till that time.
        //and if we are saying that only one item is remaining because of the above line, that is the best possible answer.
        return start; // or return end;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //find the middle element in the array
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }

            }

        }


        return -1;
    }

}
