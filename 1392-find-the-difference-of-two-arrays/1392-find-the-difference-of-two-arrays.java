class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        HashSet<Integer> n = new HashSet<>(set1);
        HashSet<Integer> m = new HashSet<>(set2);

        n.removeAll(set2);
        m.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(n));
        result.add(new ArrayList<>(m));

        return result;
    }
}