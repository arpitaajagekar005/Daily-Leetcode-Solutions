class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int open = 0;
        int close = 0; 
        generateparanthesis(s, res, open, close, n);
        return res;
    }

    private void generateparanthesis(StringBuilder s, List<String> res, int open, int close, int n){
        if(s.length() == 2*n){
            res.add(s.toString());
            return;
        }
        if(open < n){
            s.append('(');
            generateparanthesis(s, res, open + 1, close, n);
            s.deleteCharAt(s.length() - 1);
        }
        
        if(close < open){
            s.append(')');
            generateparanthesis(s, res, open, close + 1, n);
            s.deleteCharAt(s.length() - 1);
        }
        
        return;

    }
}