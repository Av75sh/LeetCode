class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", n, n, ans);
        return ans;
    }

    private void solve(String op, int open, int close, List<String> ans){
        if(open == 0 && close == 0){
            ans.add(op);
            return;
        }
        if(open > 0){
            solve(op + "(", open-1, close, ans);
        }
        if(open < close){
            solve(op + ")", open, close-1, ans);
        }
    }
}