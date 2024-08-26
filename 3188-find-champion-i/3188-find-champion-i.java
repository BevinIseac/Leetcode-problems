class Solution {
    public int findChampion(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int d = 0;
        for(int i=0;i<grid.length;i++){
            int sum=0;
            for(int j=0;j<grid[0].length;j++){
                sum =sum +grid[i][j];
            }
            if(max<sum){
                max=sum;
                d=i;
            }
        }
        return d;
    }
}