/* 216 Contain duplicate II */

import java.util.HashMap;

public class Q3 {
  
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> avinash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(avinash.containsKey(nums[i])){
                if(i - avinash.get(nums[i]) <= k){
                    return true;
                }
            }
            avinash.put(nums[i], i);
        }
        return false;
    }
}

