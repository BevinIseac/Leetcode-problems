class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int[] sum_so_far = new int[size];
        sum_so_far[0] = nums[0];
        int total_sum = nums[0];
        for(int ind = 1; ind<size;ind++){
            sum_so_far[ind] = (nums[ind] + sum_so_far[ind-1]);
            total_sum+= nums[ind];
        }
        for(int ind = 0; ind < size ; ind++){
            int front = ind * nums[ind];
            int rear = (size - ind) * nums[ind];
            int firsthalf = 0;
            int secondhalf = 0;
            if(ind - 1>=0){
                firsthalf = sum_so_far[ind -1];
            } 
            else{
                firsthalf = 0;
            }
            secondhalf = total_sum - firsthalf;
            result[ind] = secondhalf - rear + front - firsthalf;
        }
        return result;
    }
}