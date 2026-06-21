class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int first = 0;
        int last = words.length - 1;

        while(first < last){
            String temp = words[first];
            words[first] = words[last];
            words[last] = temp;
            first++;
            last--;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            res.append(words[i]);
            if(i < words.length - 1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}