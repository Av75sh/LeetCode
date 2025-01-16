/*   2425 Bitwise XOR of all Pairings

Brute Force Approach

for (int i = 0; i < nums1.length; i++) {
    for (int j = 0; j < nums2.length; j++) {
        count ^= nums1[i] ^ nums2[j];
    }
}
*/


class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int arr1 = 0, arr2 = 0;
        for(int num : nums1) arr1 ^= num;
        for(int num : nums2) arr2 ^= num;

        int result = 0;

        if(nums2.length % 2 != 0) result ^= arr1;
        if(nums1.length % 2 != 0) result ^= arr2;
        return result;
    }
}