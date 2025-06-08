class Solution {
    private int check(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = check(n);

        while(fast != 1 && slow != fast){
            slow = check(slow);
            fast = check(check(fast));
        }
        return fast == 1;
    }
}