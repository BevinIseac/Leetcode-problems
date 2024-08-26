class Solution {
    public boolean canAliceWin(int[] arr) {
        int sum=0;
        int sum1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<10){
                sum = sum + arr[i];
            }
            else{
                sum1 = sum1+arr[i];
            }
        }
        if(sum==sum1){
            return false;
        }
        return true;
    }
}