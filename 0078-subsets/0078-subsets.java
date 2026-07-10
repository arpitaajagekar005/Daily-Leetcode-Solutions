class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        rec( 0, nums, new ArrayList<>(), res);
        return res;
        
    }
    void rec(int i, int[] nums, List<Integer> curr, List<List<Integer>> res){
        
        if(i >= nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        rec(i + 1, nums, curr, res);

        curr.remove(curr.size() - 1);
        rec(i + 1, nums, curr, res);
        

    }
}