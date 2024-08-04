class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isfund = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target==matrix[i][j]){
                    isfund=true;
                    break ;
                }
            }
        }if(isfund){
            return true;
        }
        else{
            return false;
        }
    }
}