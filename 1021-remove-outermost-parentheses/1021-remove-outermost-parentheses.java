class Solution {
    public String removeOuterParentheses(String s) {
        int  open = 0;
        int count = 0;
        int n = s.length();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
                if(open > 1){
                    res.append(c);
                }
            }
            else{
                open--;
                if(open > 0){
                    res.append(c);
                }
            }

        }
        return res.toString();
    }
}