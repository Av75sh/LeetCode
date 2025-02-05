/* 334. Increasing Triplet Subsequence */



public class Q51 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7};
        System.out.println(triplet(nums));

    }

    static boolean triplet(int[] nums){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= first){
                first = num;
            }
            else if(num <= second){
                second = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
