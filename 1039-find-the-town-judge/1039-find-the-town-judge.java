class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1; 
        int[] trustCounts = new int[n + 1];
        int[] trustedBy = new int[n + 1];
        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            trustedBy[a]++;
            trustCounts[b]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustedBy[i] == 0 && trustCounts[i] == n - 1) {
                return i;
            }
        }
        return -1; 
    }
}
