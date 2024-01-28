package Linear.Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {23,4,1},{18,12,3,9},{78,99,34,56},{18,12}
        };
        int target = 34;
        int[] ans = search(arr,target);
        int max = max(arr);
        System.out.println(max);
//        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max ){
                    max = arr[row][col];
                }
            }
        }return max;
    }
}
