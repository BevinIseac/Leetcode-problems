class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = Integer.bitCount(arr[i]);
            a[i][1] = arr[i];
        }
        Arrays.sort(a, (x, y) ->
            (x[0] == y[0])? (x[1] - y[1]) : (x[0] - y[0])
        );
        for (int i = 0; i < n; i++) {
            arr[i] = a[i][1];
        }
        return arr;
    }
}