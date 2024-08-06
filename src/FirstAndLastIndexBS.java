import java.util.Arrays;

public class FirstAndLastIndexBS {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums, target);

        System.out.println(Arrays.toString(ans));
        }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, true, target);
        int end = search(nums, false, target);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, boolean firstIndex, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <=  end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(firstIndex){
                    end =  mid-1;
                }else {
                    start = mid +1;
                }
            }
        }

        return ans;
    }
}
