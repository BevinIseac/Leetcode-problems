class Solution {
    public int trap(int[] height) {
        int[] maxSoFarLeft = new int[height.length];
        int[] maxSoFarRight = new int[height.length];
        int maxLeft = 0;
        int maxRight=0;
        int r = height.length-1;

        for(int i=0; i <height.length; i++) {
            maxLeft = Math.max(maxLeft, height[i]);
            ;
            maxSoFarLeft[i] = maxLeft;
            maxRight = Math.max(maxRight, height[r]);
            maxSoFarRight[r] = maxRight;
            r--;
        }

        int maxArea = 0;
        System.out.println("");
        for(int i=1; i<height.length-1; i++){
            int minHeight =  Math.min(maxSoFarLeft[i-1], maxSoFarRight[i+1]);
            int area = 0;
            area = Math.max(0, minHeight - height[i]);
            maxArea += area;
        }
        return maxArea;
    }
}