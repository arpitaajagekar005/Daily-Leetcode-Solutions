class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        NQueen( 0 , res, board, n);
        return res;
    }
    public void NQueen(int r, List<List<String>> res, boolean[][] board, int n){

        if(r == board.length){
            List<String> ls = new ArrayList<>();
            for(int i = 0; i < board.length; i++){
                StringBuilder str =  new StringBuilder();
                for(int j = 0; j < board.length; j++){
                    str.append(board[i][j] ? "Q" : ".");
                }
                ls.add(str.toString());

            }
            res.add(ls);
            return;
        }
        
        

        for(int c = 0; c < n; c++){
            if(isSafe( board, r, c)){
                board[r][c] = true;
                NQueen( r + 1, res, board, n);
                board[r][c] = false;
                
            }
        } 
        return;
    }

    private boolean isSafe(boolean[][] board, int r, int c){
        for(int i = r - 1; i >= 0; i--){
            if(board[i][c]){
                return false;
            }
        }
        int maxleft = Math.min(r,c);
        for(int i = 1; i <= maxleft; i++){
            if(board[r - i][c - i]){
                return false;
            }
        }

        int maxright = Math.min(r,board.length - c - 1);
        for(int i = 1; i <= maxright; i++){
            if(board[r - i][c + i]){
                return false;
            }
        }
        return true;
    }
}