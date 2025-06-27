class Solution {
    public int longestMountain(int[] arr) {
        int maxLen = 0;
        int i=1;
        int n = arr.length;

        while(i < n-1){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                int left = i-1;
                int right = i+1;

                while(left > 0 && arr[left - 1] < arr[left]) left--;
                while(right < n-1 && arr[right + 1] < arr[right]) right++;

                maxLen = Math.max(maxLen, right - left + 1);
                i=right;
            } else{
                i++;
            }
        }
        return maxLen;
    }
}