class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumHelper(candidates, target, new ArrayList<Integer>(), result, 0);
        return result; 
    }
    
    private void combinationSumHelper(int[] candidates, int target, List<Integer> curr, List<List<Integer>> result, int index) {
        if(target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0) {
            return; 
        }
        for(int i = index ; i < candidates.length ; i++) {
            curr.add(candidates[i]);
            combinationSumHelper(candidates, target - candidates[i], curr, result, i);
            curr.remove(curr.size() - 1);
        }
    }
}