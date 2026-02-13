class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: put all numbers into set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: find sequences
        for (int num : set) {
            // only start counting if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
