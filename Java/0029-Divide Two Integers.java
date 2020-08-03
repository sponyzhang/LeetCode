class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int[] data = new int[32];
        int[] times = new int[32];
        boolean negative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }
        times[0] = 1;
        for (int i = 1; i < 32; i++) {
            times[i] = times[i - 1] + times[i - 1];
        }
        int tmp = divisor;
        for (int i = 0; i < 32; i++) {
            if (tmp < 0) {
                data[i] = tmp;
                tmp = tmp + tmp;
            } else {
                data[i] = 0;
            }
        }
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if (data[i] != 0 && dividend - data[i] <= 0) {
                res = res + times[i];
                dividend = dividend - data[i];
            }
        }
        return negative == true ? -res : res;
    }
}
