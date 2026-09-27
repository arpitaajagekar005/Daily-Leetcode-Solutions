class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bottom = row - 1;
        int l = 0;
        int r = col - 1;

        while (top <= bottom && l <= r) {

            if(top <= bottom){
                for (int i = l; i <= r; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][r]);
            }
            r--;

            
            if (l <= r && top <= bottom) {
                for (int i = r; i >= l; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            
            if (top <= bottom && l <= r) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }

        return result;

    }
}