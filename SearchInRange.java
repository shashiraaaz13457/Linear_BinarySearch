package Linear.Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 12;
        int start = 1;
        int end = 4;
        System.out.println(linearSearch(arr,target,start,end));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            if (target == arr[index]){
                return index;
            }
        }return -1;
    }
}
