class Solution {
    private void dfs(List<String> list, String str, int left, int right) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }
        dfs(list, str + "(", left - 1, right);
        dfs(list, str + ")", left, right - 1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        dfs(res, "", n, n);
        return res;
    }
}
