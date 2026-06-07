class Solution {
    public int[] searchRange(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        int ceil = -1;
        int floor = -1;
        int [] res = new int[2];

        while(beg <= end){
          int mid = beg + (end - beg)/2;

          if(nums[mid] == target){
            floor = mid;
            end = mid - 1;
          }
          else if(nums[mid] < target){
            beg = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        beg = 0;
        end = nums.length - 1;
        while(beg <= end){
          int mid = beg + (end - beg)/2;

          if(nums[mid] == target){
                ceil = mid;
                beg = mid + 1;
            }
            else if(nums[mid] > target){
               end = mid - 1; 
            }
            else{
                beg = mid + 1;
            }
        }
        res[0] = floor;
        res[1] = ceil;

        return res;
    }
}