class Solution {
    private int maxLen;
    private String res;
    
    private void findLongestPalindromicString(String s, int left, int right) {
        while (left >= 0 && right <= s.length() - 1) {
            if (s.charAt(left) == s.charAt(right)) {
                if (maxLen < right - left + 1) {
                    maxLen = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                left--;
                right++;
            } else {
                break;
            }
        }
    }
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        maxLen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            findLongestPalindromicString(s, i, i);
            findLongestPalindromicString(s, i, i + 1);
        }
        return res;
    }
}
