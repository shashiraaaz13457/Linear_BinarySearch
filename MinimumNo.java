package Linear.Search;

public class MinimumNo {
    public static void main(String[] args) {
        int[] arr =  {18,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        //Assume array is not empty..
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }return min;
    }
}
