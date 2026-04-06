class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();

        for(int num : nums){
            count[num]++;
        }
    
        for(int i=1; i<=nums.length; i++){
            if(count[i] == 0){
                res.add(i);
            }else{
                continue;
            }
        }
        return res;
    }
}