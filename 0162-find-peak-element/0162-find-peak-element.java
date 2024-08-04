class Solution {
    public int findPeakElement(int[] nums) {
        int peak=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1||nums[i]>nums[i+1]){
                peak=i;
                break;
            }
            
        }
        return peak;
    }
}