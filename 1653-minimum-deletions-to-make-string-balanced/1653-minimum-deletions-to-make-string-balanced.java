class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] aCount = new int[n];
        int[] bCount = new int[n];

        for(int i=1; i<n; i++){
            char prevCh = s.charAt(i-1);
            bCount[i] = bCount[i-1];
            if(prevCh == 'b') bCount[i] += 1;
        }

        for(int i=n-2; i>=0; i--){
            char prevCh = s.charAt(i+1);
            aCount[i] = aCount[i+1];
            if(prevCh == 'a') aCount[i] += 1;
        }

        int minDel = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minDel = Math.min(minDel, aCount[i] + bCount[i]);
        }

        return minDel;
    }
}