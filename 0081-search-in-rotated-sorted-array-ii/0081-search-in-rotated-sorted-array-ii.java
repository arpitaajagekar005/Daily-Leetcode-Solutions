class Solution {
    public boolean search(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        int mid = beg + (end - beg) / 2;
        if(nums.length == 1){
             return (nums[0] == target) ? true : false ;
        }

        while(beg <= end){
            mid = beg + (end - beg) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[beg] == nums[mid] && nums[mid] == nums[end]){
                beg++;
                end--;
            }
            else{
                if(nums[mid] <= nums[end]){
                    if(nums[mid] <= target && target <= nums[end]){
                        beg = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
                else{
                    if(nums[beg] <= target && target <= nums[mid]){
                        end = mid - 1;
                    }
                    else{
                        beg = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}