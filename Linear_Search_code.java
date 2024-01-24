public class Linear_Search_code {
    public static void main(String[] args) {
        int[] nums = {23,1,45,2,8,16,19,-9};
        int target = 199;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    //Search in the array: return the index if item found
    //Otherwise if the item not found return -1
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            if (arr[i] == target){
                return i;
            }
        }return -1;
    }
}
