class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= Integer.MIN_VALUE;
        int len = candies.length;
        for(int i=0;i<len;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        List<Boolean> c = new ArrayList<>();
        for(int i=0;i<len;i++){
            if((candies[i]+extraCandies)>=max){
                c.add(true);
            }
            else{
                c.add(false);
            }
        }
        return c;
    }
}