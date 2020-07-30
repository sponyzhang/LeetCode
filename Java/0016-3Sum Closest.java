class Solution {
    private int abs(int a) {
        return a > 0 ? a : -a;
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = target;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (abs(sum - target) < abs(diff)) {
                    diff = sum - target;
                    res = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
