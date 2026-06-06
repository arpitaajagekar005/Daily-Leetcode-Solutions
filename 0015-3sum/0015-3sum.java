class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length ;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int k = n - 1;
            int j = i+1;
            while(j < k){

                
                List<Integer> triplet = new ArrayList<>();
                if((nums[i] + nums[j] + nums[k]) == 0){
                    
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    
                    res.add(triplet);

                    while(j < k && nums[j] == nums[j+1]) j++;
                    
                    while(j < k && nums[k] == nums[k-1]) k--;

                    j++;
                    k--;
                }
                else if((nums[i] + nums[j] + nums[k]) < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return res;
    }
}