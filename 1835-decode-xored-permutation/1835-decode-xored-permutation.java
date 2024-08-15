class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int arr[]=new int[n];
        int a=0;
        int b=0;
        for(int i=1;i<=n;i++)
            a=a^(i);
        for(int i=1;i<n;i+=2)
            b=b^encoded[i];
        int first=a^b;
        arr[0]=first;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1]^encoded[i-1];
        }
        return arr;
    }
}