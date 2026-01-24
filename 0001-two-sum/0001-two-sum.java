class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] idx=new int[2];
        for(int i=0;i<nums.length;i++){
        int Deff=target-nums[i]; 
        for(int j=i+1;j<nums.length;j++){
            if(Deff==nums[j]){
                idx[0]=i;
                idx[1]=j;
                 return idx;
            }
        }
       }
      return idx;
    }
}