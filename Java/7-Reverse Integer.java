class Solution {
    private int abs(int n) {
        return n > 0 ? n : -n;
    }
    
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (abs(res) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res = res * 10 + (x % 10);
            x /= 10;
        }
        return res;
    }
}
