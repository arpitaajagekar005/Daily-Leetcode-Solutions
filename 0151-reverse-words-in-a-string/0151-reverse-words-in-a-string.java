class Solution {
    public String reverseWords(String s) {
// 1. Clean up spaces and split into words
        String[] words = s.trim().split("\\s+");
        Stack<String> stack = new Stack<>();

        // 2. Push all words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // 3. Pop words from the stack to build the reversed string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            
            // Add a space if it's not the last word coming out of the stack
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}