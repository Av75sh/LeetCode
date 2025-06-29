class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=left; i<=right; i++){
           boolean isSelfdividing = true;
           int num = i;

           while(num > 0){
            int digit = num % 10;
            if(digit == 0 || i % digit != 0){
                isSelfdividing = false;
                break;
            }
            num /= 10;
           }

           if(isSelfdividing) result.add(i);
        }
        return result;
    }
}