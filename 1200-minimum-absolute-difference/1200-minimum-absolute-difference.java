class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i] - arr[i-1]);
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i] - arr[i-1] == min){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;
    }
}