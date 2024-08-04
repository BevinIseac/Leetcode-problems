class Solution {
    public int maxProduct(int[] nums) {
        int a = nums.length;
        Arrays.sort(nums);
        return ((nums[a-1]-1)*(nums[a-2]-1));
    }
}