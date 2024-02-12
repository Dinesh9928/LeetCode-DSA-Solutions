class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for(int i=0; i< n; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverseing row
        for(int i=0; i<n; i++){
            reverse(0, n-1, matrix[i]);
        }
    }
    private void reverse(int i, int j, int[] A){
        while(i<j){
            swap(i++, j--, A);
        }
    }
    private void swap(int i, int j, int[] A){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}