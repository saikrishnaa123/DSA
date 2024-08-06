import java.util.Arrays;

public class NumberOfPair {

    public static void main(String[] args) {
        int[] result = {4,2,1,6,7};
        System.out.println(pairs(2, result));
    }

    static int pairs(int target, int[] arr) {
        Arrays.sort(arr);

        int count = 0;

        for(int i : arr){
            int nts = i - target;
            if(bs(nts, arr)){
                count++;
            }
        }

        return count;
    }

    static boolean bs(int target, int[] arr){
        int j =0;
        int end = arr.length -1;
        while(j <= end) {
            int mid = j + (end -j)/2;
            if(arr[mid] == target){
                return true;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }else {
                j = mid + 1;
            }

        }

        return false;
    }
}
