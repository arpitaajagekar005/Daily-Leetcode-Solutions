class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] idx = new int[2];
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            count.put(nums[i],i);
        }


        for(int i=0; i<nums.length; i++){
            int Deff = target - nums[i]; 

            if(count.containsKey(Deff)){
                if(count.get(Deff) != i){
                    idx[0] = i;
                    idx[1] = count.get(Deff);
                    return idx;
                }
            }
            
        }
        return idx;
    }
}