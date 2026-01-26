class Solution {
    
    public int missingNumber(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        //putting all nums values in map
        for(int n:nums){
            map.put(n,1);
        }
        //checking if all numbers present in map
        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return i;
            }

        }
        return -1;
    }
}