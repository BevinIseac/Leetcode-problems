class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum =0;
        for(int i=0;i<apple.length;i++){
            sum = sum+apple[i];
        }
        Arrays.sort(capacity);
        int ans =0;
        int count =1;
        for(int i=capacity.length-1;i>=0;i--){
            ans = ans + capacity[i];
            if(sum>ans){
                count++;
            }
        }
        return count;
    }
}