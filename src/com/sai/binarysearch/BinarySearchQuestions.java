package com.sai.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchQuestions {

    public static void main(String[] args) {
        int[] arr = {15, 23, 35, 55, 75, 92};
        int[] arrFirstAndLast = {15, 23, 23, 23, 23, 23, 45, 65, 80, 95};
        //  System.out.println(BS(arr, 12));
        char[] letters = {'c', 'f', 'j'};
        //System.out.println(smallestLetter(letters, 'd'));
        //System.out.println(Arrays.toString(searchRangeFirstAndLastOccurence(arrFirstAndLast, 23)));
        // System.out.print(infiniteArrBS(arr, 75));
        int[] peekArr = {1, 2, 3, 6, 8, 7, 5, 4};
        // System.out.println(peekInMountainArr(peekArr));
        // System.out.println(findInMountArr(peekArr, 8));
        int[] rotatedSortedArrCase1 = {4, 5, 6, 0, 1, 2};
        //  System.out.println(findPivotInRotatedSortedArr(rotatedSortedArrCase1)); // when mid > mid + 1
        int[] rotatedSortedArrCase2 = {4, 5, 6, 0, 1, 2, 3};
        // System.out.println(findPivotInRotatedSortedArr(rotatedSortedArrCase2));// when mid < mid - 1
        int[] rotatedSortedArrCase3 = {6, 0, 1, 2, 3, 4, 5};
        // System.out.println(findPivotInRotatedSortedArr(rotatedSortedArrCase3));// when start > mid
        int[] rotatedSortedArrCase4 = {2, 3, 4, 5, 6, 0, 1};
        // System.out.println(findPivotInRotatedSortedArr(rotatedSortedArrCase4));// when start < mid
        //System.out.println(searchInRotatedSortedArr(rotatedSortedArrCase1, 5));
        //  System.out.println(searchInRotatedSortedArr(rotatedSortedArrCase2, 3));
        //System.out.println(searchInRotatedSortedArr(rotatedSortedArrCase3, 5));
        // System.out.println(searchInRotatedSortedArr(rotatedSortedArrCase4, 6));

        int[] rotatedSortedWithDuplicates = {3, 4, 4, 4, 6, 0, 1, 2};
        System.out.println(findPivotInRotatedSortedArrWithDuplicates(rotatedSortedWithDuplicates));

        System.out.println(countRotations(rotatedSortedArrCase1));

    }

    static int BS(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }


    static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }


    static int[] searchRangeFirstAndLastOccurence(int[] arr, int target) {
        int first = firstAndLastOccurence(arr, target, true);
        int last = firstAndLastOccurence(arr, target, false);
        return new int[]{first, last};
    }


    static int firstAndLastOccurence(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


    static int infiniteArrBS(int[] arr, int target) {
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            //end = end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return BS(arr, target, start, end);
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }


    static int BS(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int peekInMountainArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                //you are in the descing part of the array
                //your answer can be mid(this is why end != mid -1) or can lie behind mid(so look at left)
                end = mid;
            } else {
                //you are in ascending part
                // we know that mid + 1 is greter than mid so we are ignoring mid and taking mid + 1
                start = mid + 1;
            }
        }
        //in the end start == end and pointing to the largest number becuase of the 2 checks above
        //start and end are trying to find max element in the above 2 checks
        //in the end they are pointing to only one element, that is the max one  because that is what checks says
        // at every point of time, start and end will have best possible answer till that time.
        //if we are saying that only one item is remaining, hence cuz of above line this is the possible answer
        return start; // or return end
    }

    static int findInMountArr(int[] arr, int target) {
        int peek = findPeekElement(arr);
        int result = BS(arr, target, 0, peek);
        if (result == -1) {
            return orderAgnosticBS(arr, target, peek, arr.length - 1);
        }
        return result;
    }

    static int findPeekElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int searchInRotatedSortedArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivotInRotatedSortedArr(arr);
        if (pivot == -1) {
            return BS(arr, target, start, end);
        }
        if (target == arr[pivot]) {
            return pivot;
        }
        if (target >= arr[0]) {
            return BS(arr, target, start, pivot - 1);
        }
        return BS(arr, target, pivot + 1, end);  // target < arr[0]


    }

    static int findPivotInRotatedSortedArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1; // arr[start] < arr[mid]
            }
        }

        return -1;
    }

    static int findPivotInRotatedSortedArrWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) { //4, 5, 6,4,1,2,3 arr[start] == arr[mid] && arr[mid] > arr[end])
                start = mid + 1;
            } else {
                end = mid - 1; // arr[start] < arr[mid]
            }
        }

        return -1;
    }

    static int countRotations(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int pivot = findPivotInRotatedSortedArr(arr);
        return pivot + 1;
    }



    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int count=0;

        for(int i = 0; i < arr.size(); i ++){
            if(bs(arr.get(i) + k,i,arr.size() -1,arr)){
                count ++;
            }
        }

        return count;

    }

    public static boolean bs(int target,int s, int e, List<Integer> arr){
        while(s <= e) {
            int m = s + (e - s)/2;
            if(arr.get(m) == target) {
                return true;
            }

            if(arr.get(m) > target){
                e = m - 1;
            } else {
                s =m + 1;
            }
        }

        return false;
    }

}
