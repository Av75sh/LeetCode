class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();

        solve(s, "", ans);
        return ans;
    }

    private static void solve(String input, String output, List<String> ans){
        if(input.length() == 0){
            ans.add(output);
            return;
        }

        char ch = input.charAt(0);
        String newS = input.substring(1);

        if(Character.isLetter(ch)){
            solve(newS, output + Character.toLowerCase(ch), ans);
            solve(newS, output + Character.toUpperCase(ch), ans);
        }
        else{
            solve(newS, output + ch, ans);
        }

    }
}