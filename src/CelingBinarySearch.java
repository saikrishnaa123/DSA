// Ceiling means number that is greater than or = target
public class CelingBinarySearch {
    public static void main(String[] args) {

        int[] arr = {22, 56, 78, 89, 94, 99};
        int target = 0;
        System.out.println(returnIndex(arr, target));

    }

    static int returnIndex(int[] arr, int target) {

        //what if target is greater than the greaterst number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

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
        // when while condition breaks i.e., start = end + 1 then the next big number = start.
        return arr[start];
    }
}