class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
      int arr[]=new int[len*2];
      for(int i=0;i<len;i++){
        arr[i]=nums[i];
        arr[i+len]=nums[i];
      }
      System.gc();
      return arr;
    }
}