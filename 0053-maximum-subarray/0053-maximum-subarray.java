class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int check =nums[0];

        for(int i=0; i < nums.length; i++){
            count += nums[i];

            if(check < count){
            check = count;
            }
                
            if(count < 0){
                count = 0;
            }
        }
        return check;
    }
}