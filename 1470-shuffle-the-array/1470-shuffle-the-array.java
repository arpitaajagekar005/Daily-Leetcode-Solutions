class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans1 = new int[n];
        int [] ans2 = new int[n];
        int [] res = new int [2*n];

        for(int i=0; i<n; i++){
            ans1[i] = nums[i];
            ans2[i] = nums[n+i];
        }
        int k=0;
        int l=0;
        for(int i=0; i<2*n; i++){
            if((i+1)%2 != 0){
                res[i] = ans1[k];
                k++;
            }
            else{
                res[i] = ans2[l];
                l++;
            }
        }
        return res;
    }
}