class Solution {
    public void moveZeroes(int[] nums)
    {   int l=nums.length;
        int[] temp=new int[l];
        int idx=0;
        for(int i=0;i<=l-1;i++){
            if(nums[i]!=0) {
                temp[idx]=nums[i];
                idx++;
            }
        }
     for(int i=0;i<=l-1;i++){
         nums[i]=temp[i];
     }
    }
}