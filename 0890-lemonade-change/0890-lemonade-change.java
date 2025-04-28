class Solution {
    public boolean lemonadeChange(int[] nums) {
        int five = 0, ten = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 5) five += 1;
            else if(nums[i] == 10){
                if(five > 0){
                    five -= 1;
                    ten += 1;
                }
                else return false;
            }
            if(nums[i] == 20){
                if(five > 0 && ten > 0){
                    five -=1;
                    ten -=1;
                }
                else if (five >= 3) five -= 3;
                else return false;
            }
        }
        return true;
    }
}