class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashMap<Integer, Integer> avinash = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num : nums2){
            while(!st.isEmpty() && num > st.peek()){
                avinash.put(st.pop(), num);
            }
            st.push(num);
        }

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = avinash.getOrDefault(nums1[i], -1);
        }
        return arr;
    }
}