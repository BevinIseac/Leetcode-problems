class Solution {
    public void solve(List<String> result, int left, int right, String str, int n){
        if(str.length()==n*2){
            result.add(str);
            return;
        }
        if(left<n){
            solve(result, left+1, right, str +"(", n);
        }
        if(right<left){
            solve(result, left, right+1, str+")", n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String str = "";
        solve(result, 0, 0, str, n);
        return result;
    }
}