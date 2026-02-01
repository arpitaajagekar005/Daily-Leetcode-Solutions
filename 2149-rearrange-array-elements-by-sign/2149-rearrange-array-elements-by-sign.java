class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length];
        int[] neg=new int[nums.length];
        int pidx=0;
        int nidx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[pidx++]=nums[i];

            }else{
                neg[nidx++]=nums[i];
            }
        }
        int idx=0;
        int i=0;
        int j=0;
        while(idx<nums.length){
            if(idx%2==0){
                nums[idx]=pos[i++];
            }else{
                nums[idx]=neg[j++];
            }
            idx++;
        }
        return nums;
    }
}