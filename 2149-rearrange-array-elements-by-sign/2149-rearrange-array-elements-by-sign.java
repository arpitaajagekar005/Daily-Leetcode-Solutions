class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int pidx=0;
        int nidx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[pidx++]=nums[i];

            }else{
                neg[nidx++]=nums[i];
            }
        }
        for(int i=0;i<pos.length;i++){
            nums[i*2]=pos[i];
            nums[i*2+1]=neg[i];
        }
        return nums;
    }
}