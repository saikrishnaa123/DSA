import java.util.Arrays;

public class RowColumnMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14},
                    {15, 16, 17, 18}
        };
        int target = 17;
        System.out.println(Arrays.toString(searchBS2DArray(arr, target)));

    }

    static  int[] searchBS2DArray(int[][] matrix, int target){
        int row =0;
        int column = matrix.length - 1;
        while(row < matrix.length && column >= 0){
            if(target ==  matrix[row][column]){
                return new int[]{row, column};
            }
            if(target < matrix[row][column]){
                column--;
            }else {
               row ++;
            }
        }
        return new int[]{-1,-1};
    }
}
