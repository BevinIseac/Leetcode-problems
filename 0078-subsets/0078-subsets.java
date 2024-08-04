class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        var ans = new ArrayList<List<Integer>>();
        solve(nums, 0, List.of(), ans);
        return ans;   
    }

    public void solve(int[] nums, int n, List<Integer> curr, List<List<Integer>> ans) {
        if (n == nums.length) {
            ans.add(curr);
            return;
        }
        // we have the choice of adding or not

        // don't add
        solve(nums, n + 1, curr, ans);

        // add
        var copy = new ArrayList<>(curr);
        copy.add(nums[n]);
        solve(nums, n + 1, copy, ans);
    }
}