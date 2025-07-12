class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> s1 = new HashSet<>();
       HashSet<Integer> result = new HashSet<>();

       for(int num : nums1) s1.add(num);

       for(int num : nums2){
        if(s1.contains(num)) result.add(num);
       }
      
      int[] arr = new int[result.size()];
      int i = 0;
      for(int num : result){
        arr[i++] = num;
      }
      return arr;
    }
}