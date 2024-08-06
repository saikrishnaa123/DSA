import java.util.Arrays;

public class MergeSort {


    static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right =  mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] right){
        int[] mix = new int[first.length + right.length];

        int i = 0;
        int j = 0;
        int k =0;

        while(i < first.length && j < right.length){
            if(first[i] < right[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
