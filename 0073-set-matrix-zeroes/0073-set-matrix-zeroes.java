class Solution {
    private static final int INFINITY_MARKER = -999999;
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    set_infinity(matrix, i, j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == INFINITY_MARKER){
                    matrix[i][j] = 0;
                }
            }
        }
             

        
    }
    void set_infinity(int [][]matrix, int rows, int cols){
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0; i < r; i++){
            if(matrix[i][cols] != 0){
                matrix[i][cols] = INFINITY_MARKER;
            }
        }
        for(int i = 0; i < c; i++){
            if(matrix[rows][i] != 0){
                matrix[rows][i] = INFINITY_MARKER;
            }
        }
        
    }
}