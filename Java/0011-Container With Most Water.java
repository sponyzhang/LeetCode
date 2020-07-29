class Solution {
    private int min(int a, int b) {
        return a > b ? b : a;
    }

    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int res = 0;
        while (head <= tail) {
            int area = (tail - head) * min(height[head], height[tail]);
            if (res < area) {
                res = area;
            }
            if (height[head] < height[tail]) {
                head++;
            } else {
                tail--;
            }
        }
        return res;
    }
}
