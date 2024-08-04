class Solution {
    public int buyChoco(int[] prices, int money) {
        int min= Integer.MAX_VALUE;
        int len = prices.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int sum = prices[i] + prices[j];
                if(min>sum){
                    min=sum;
                }
            }
        }
        if(min>money){
            return money;
        }
        else{
            return money-min;
        }
    }
}