public class SearchIndexBinarySearch {
    public static void main(String[] args) {

        int[] arr = {22, 56, 78, 89, 94, 99};
        int target = 22;
        System.out.println(returnIndex(arr, target));

    }

    static int returnIndex(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find the middle element in the array
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = end - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}