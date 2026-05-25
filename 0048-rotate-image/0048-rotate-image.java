class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length -1;
        int i = 0;
        int j = n;
        while(i < j){
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
        
        for(int l = 0; l <= n; l++){
            for(int m = l+1; m <= matrix[0].length-1; m++){
                int temp = matrix[l][m];
                matrix[l][m] = matrix[m][l];
                matrix[m][l] = temp;
            }
        }
    }
}