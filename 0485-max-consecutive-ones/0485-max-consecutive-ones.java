class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int check=0;
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=0){
                count++;
            }else{
                if(check<count){
                    check=count;
                }
                count=0;
            }
        }
        if(check<count){
                check=count;
            }
        return check;
    }
}