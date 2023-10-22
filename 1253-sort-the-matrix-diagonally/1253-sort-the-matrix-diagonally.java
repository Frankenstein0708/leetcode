class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // vertically
        for (int i=0;i<mat.length;i++) {
            bubbleSort(mat, new int[] { i, 0 });
        }
        // horizontally
        for (int i=0;i<mat[0].length;i++) {
            bubbleSort(mat, new int[] { 0, i});
        }
        
        return mat;
    }
    
    void bubbleSort(int[][] mat, int[] start) {
        int row = start[0], col = start[1], M = mat.length, N = mat[0].length;
        
        for (int i=0;row+i<M && col+i<N;i++) {
            for (int j=i;row+j<M && col+j<N;j++) {
                int a = mat[row+i][col+i];
                int b = mat[row+j][col+j];
                
                if (b < a) {
                    mat[row+i][col+i] = b;
                    mat[row+j][col+j] = a;
                }
            }
        }
    }
}