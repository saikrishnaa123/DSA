public class FloorBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,5,7,8};
        System.out.println(floorNumber(arr, -17));
    }

    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            //boolean isAsc = arr[start] <= arr[end];
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }


            }  else {
                if(target < arr[mid] ){
                   start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return start;
    }
}
