class Solution {
    
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        for(int i=0;i< matrix.length;i++){
            reverse(matrix[i]);
        }
    }

    static void reverse(int matrix[]){
        int i=0,j=matrix.length-1;

        while(i<=j){
            int y = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = y;

            i++;
            j--;
        }
    }
}
