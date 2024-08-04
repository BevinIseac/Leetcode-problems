class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles>=numExchange){
            int total = numBottles/numExchange;
            numBottles=(numBottles%numExchange)+total;
            sum=sum+total;
        }return sum;
    }
}