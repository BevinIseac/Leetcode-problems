class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int ans[]=new int[n];
        int all=0;
        int encod=0;
        for(int i=1;i<=n;i++)
            all=all^(i);
        for(int i=1;i<n;i+=2)
            encod=encod^encoded[i];
        int first=all^encod;
        ans[0]=first;
        for(int i=1;i<n;i++)
        {
            ans[i]=ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}