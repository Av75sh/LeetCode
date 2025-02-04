/* 121. Best Time to Buy and Sell Stock */

public class Q1 {
        public int maxProfit(int[] prices) {
           int max1 = 0, max2 = 0;
           for(int i=1; i<prices.length; i++){
            max1 = Math.max(0, max1 + (prices[i] - prices[i-1]));
            max2 = Math.max(max1, max2);
           }
           return max2;
        }
    }
