class Solution {
    public int largestAltitude(int[] gain) {
        int a = gain.length;
        int[] arr = new int[a+1];
        arr[0]=0;
        int j=0;
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+gain[j];
            j++;
        }
        Arrays.sort(arr);
        return arr[a];
    }
}