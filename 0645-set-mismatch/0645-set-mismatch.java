class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int n = nums.length; 
        int sum = 0;
        int total = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        java.util.Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                res[0] = nums[i]; 
                break;
            }
        }

        res[1] = total - (sum - res[0]);

        return res;
    }
}