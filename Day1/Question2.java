/* 1431 Kids with candies 

package Day1;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max = 0;
       for(int candy : candies){
        if(candy > max){
            max = candy;
        }
       }

       List<Boolean> result = new ArrayList<>();
       for(int candy : candies){
        result.add(candy + extraCandies >= max);
       }
       return result;
    }
}
}
*/