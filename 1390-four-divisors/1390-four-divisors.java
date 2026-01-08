class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int n : nums) ans += divisorSum(n);
        return ans;
    }

    private int divisorSum(int n){
        int sum = 0, count = 0;

        for(int i=1; i*i <=n; i++){
            if(n % i == 0){
                int d = n/i;

                if(i == d){
                    count++;
                    sum += i;
                } else {
                    count += 2;
                    sum += i+d;
                }
                if(count > 4) return 0;
            }
        }
        return (count == 4) ? sum : 0;
    }
}