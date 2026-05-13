class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int maxLength = 0;
        int count = 0;
        int current = 0;
        for(int num:nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                current = num;
                count = 1;

            while(set.contains(current+1)){
                current++;
                count++;
                }
            maxLength = maxLength > count ? maxLength : count;
            }
        }
        return maxLength;
    }
}