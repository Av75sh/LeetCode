class Solution {
    public int minimumDeletions(String s) {
        int n = s.length(), bCount = 0;
        int[] aCount = new int[n];
        int minDel = Integer.MAX_VALUE;

        for(int i=n-2; i>=0; i--){
            char prevCh = s.charAt(i+1);
            aCount[i] = aCount[i+1];
            if(prevCh == 'a') aCount[i] += 1;
        }

        for(int i=0; i<n; i++){
            minDel = Math.min(minDel, aCount[i] + bCount);
            if(s.charAt(i) == 'b') bCount += 1;
        }

        return minDel;
    }
}