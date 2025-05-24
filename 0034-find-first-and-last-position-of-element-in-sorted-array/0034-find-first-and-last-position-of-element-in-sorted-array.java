class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = first(nums, target);
        arr[1] = last(nums, target);
        return arr;
    }

    static int first(int[] nums, int target){
        int start = 0, end = nums.length - 1, index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
    static int last(int[] nums, int target){
        int start = 0, end = nums.length - 1, index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
}