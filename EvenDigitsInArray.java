package Linear.Search;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] nums = {12,3458,2,6,7896};
        System.out.println(findNumbers(nums));

//        System.out.println(digit(-5789));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (even(nums[index])){
                count++;
            }
        }
        return count;
    }


    //function to check whether a number contains even digit or not
    static boolean even(int num){
        int numberOfDigit = digit(num);
        if (numberOfDigit % 2 == 0){
            return true;
        }return false;
    }


    //checking number of digits in a number..
    static int digit(int num){
        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count= 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
