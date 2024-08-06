//if we don't know if array is asc or dec
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {89, 67, 45, 32, 54, 12};
        int target = 67;
        System.out.println(orderAgnosticBS(arr, target));

    }


    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
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
