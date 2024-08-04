class Solution {
    public int maximumGap(int[] nums) {
         if(nums==null||nums.length<2){
                    return 0;
                }
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int len = nums.length;
        
        for(int i=1;i<len;i++){
            for(int j=i-1;j<i;j++){
                int sum = nums[i]-nums[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}