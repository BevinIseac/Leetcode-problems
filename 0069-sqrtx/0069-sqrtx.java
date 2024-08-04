class Solution {
    public int mySqrt(int x) {
       // return (int)(Math.sqrt(x));
       long lo =0;
       long hi = x;
       while(lo<=hi){
        long m = lo +(hi-lo)/2;
        if(m*m==x){
            return(int) m ;
        }else if (m*m>x){
            hi= m-1;
        }else if(m*m<x){
            lo =m+1;
        }
       }
       return (int)hi;
    }
}