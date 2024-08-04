class Solution {
    public int reverse(int x) {
        int sum=0;
        int temp;
       
        while(x!=0){
            temp=x%10;
            if(sum>Integer.MAX_VALUE/10||sum==Integer.MAX_VALUE/10&&temp>7)return 0;
             if(sum<Integer.MIN_VALUE/10||sum==Integer.MIN_VALUE/10&&temp<-8)return 0;
            sum=(sum*10)+temp;
            x=x/10;
        }
         if(x<0){
            sum = -sum;
            return sum;
        }else
            return sum;
    }
}