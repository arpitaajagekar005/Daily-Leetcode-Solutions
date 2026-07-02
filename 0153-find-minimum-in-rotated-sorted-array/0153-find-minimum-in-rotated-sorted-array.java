class Solution {
    public int findMin(int[] nums) {
        int beg = 0;
        int end = nums.length - 1;
        int mid = beg + (end - beg) / 2;
        int min = mid;

        while(beg <= end){
            mid = beg + (end - beg) / 2;
            if(nums[beg] <= nums[mid] || nums[end] <= nums[mid]){
                if(nums[beg] <= nums[end]){
                    end = mid - 1;
                }
                else{
                    beg = mid + 1;
                }
            }else{
                 beg++;
                 end--;
            }
            min = mid;
        }
        return nums[min];
    }
}