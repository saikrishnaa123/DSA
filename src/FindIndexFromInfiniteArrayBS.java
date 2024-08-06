public class FindIndexFromInfiniteArrayBS {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target = 15;
        System.out.println(findIndex(arr,target));
    }

    static int findIndex(int[] nums, int target){
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while(target > nums[end]){
            int newStart = end + 1; // this is my new start
            //double the box value
            //end =previousend + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
         return binarySearch(nums,target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
       // int start = 0;
        //int end = 1;
        while(start <= end){
            int mid =  start + (end-start)/2;
            if(target > nums[mid]){
               start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
