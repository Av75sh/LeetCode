class Solution {
    public int[] findEvenNumbers(int[] digits) {
       int[] freq = new int[10];
       for(int num : digits) freq[num]++;

       ArrayList<Integer> avinash = new ArrayList<>();

       for(int i=100; i<999; i+=2){
        int a = i/100;
        int b = (i/10) % 10;
        int c = i%10;

        int[] count = new int[10];
        count[a]++;
        count[b]++;
        count[c]++;

        boolean found = true;
        for(int j=0; j<10; j++){
            if(count[j] > freq[j]){
                found = false;
                break;
            }
        }
        if(found) avinash.add(i);
       }

       int[] ans = new int[avinash.size()];
       for(int i=0; i<avinash.size(); i++) ans[i] = avinash.get(i);
       return ans;
    }
}