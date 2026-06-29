class Solution {
    public int search(int[] nums, int target) {
        // int beg = 0;
        // int end = nums.length - 1;
        // int mid = beg + (end - beg) / 2;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}