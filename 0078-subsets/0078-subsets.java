class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> s = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        incOrNot(0, nums, l, s);
        return s;
        
    }
    private static List<List<Integer>> incOrNot(int index, int[] nums, List<Integer> l, List<List<Integer>> s){
        if(index == nums.length){
            s.add(new ArrayList<>(l));
            return s;
        }
        
        l.add(nums[index]);
        incOrNot(index + 1, nums, l, s);
        l.remove(l.size() - 1);
        incOrNot(index + 1, nums, l, s);
        return s;
    }
}