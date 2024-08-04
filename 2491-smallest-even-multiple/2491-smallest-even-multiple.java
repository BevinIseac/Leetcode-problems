class Solution {
    public int smallestEvenMultiple(int n) {
        int a;
        if(n%2==0){
            a =2*(n/2);
        }
        else{
            a = 2*n;
        }
        return a;
        
    }
}