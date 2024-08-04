class Solution {
    public int[][] transpose(int[][] matrix) {
        int len = matrix.length;
        int col = matrix[0].length;
        int [][]arr = new int[col][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<col;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}