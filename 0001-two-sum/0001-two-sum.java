class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] idx=new int[2];
        for(int i=0;i<nums.length;i++){
        int Deff=target-nums[i]; 
        int j=i+1;
        while(j<nums.length){
            if(Deff==nums[j]){
                idx[0]=i;
                idx[1]=j;
            }
            j++;
        }
       }
       return idx;
    }
}