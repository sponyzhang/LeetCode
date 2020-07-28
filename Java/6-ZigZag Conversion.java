class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            int shift1 = (numRows - i - 1) * 2;
            int shift2 = i * 2;
            for (int j = i; j < s.length();) {
                if (shift1 != 0 && j < s.length()) {
                    buffer.append(s.charAt(j));
                    j += shift1;
                }
                if (shift2 != 0 && j < s.length()) {
                    buffer.append(s.charAt(j));
                    j += shift2;
                }
            }
        }
        return buffer.toString();
    }
}
