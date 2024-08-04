class Solution {
    public int countPrimes(int n) {
        int count=-1;
        if(n<2) return 0;
        int[] a= new int[n+1];
        for(int i=0; i<=n; i++) {
            a[i]=i;
        }
        a[1]= 0;
        for(int i=2; i*i<n; i++) {
            if(a[i]!=0) {
                for(int j=2; (i*j)<n; j++) {
                    if(a[i*j]!=0)   a[i*j]= 0;
        }}}
        for(int p: a) if(p!=0) count++;
        return count;
    }
}