class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int []arr = new int[n*(n+1)/2];
        for(int i=0,k=0;i<n;++i){
            int sum =0;
            for(int j=i;j<n;++j){
                sum = sum+nums[j];
                arr[k++]=sum;
            }
        }
        Arrays.sort(arr);
        int sum1=0;
        final int mod = (int)1e9+7;
        for(int i=left-1;i<right;++i){
            sum1=(sum1+arr[i])%mod;
        }
        return sum1;
    }
}