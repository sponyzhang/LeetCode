class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] state = new int[128];
        int res = 0;
        int cur = 0;
        for (int i = 0; i < state.length; i++) {
            state[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (state[s.charAt(i)] == -1 || (i - state[s.charAt(i)]) > cur) {
                cur++;
            } else {
                cur = i - state[s.charAt(i)];
            }
            state[s.charAt(i)] = i;
            if (res < cur) {
                res = cur;
            }
        }
        return res;
    }
}
