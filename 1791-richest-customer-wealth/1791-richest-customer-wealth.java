class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int len = accounts.length;
        
        for(int i=0;i<len;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}