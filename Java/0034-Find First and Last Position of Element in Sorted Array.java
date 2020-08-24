class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target && (middle == 0 || nums[middle - 1] != target)) {
                res[0] = middle;
                break;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (res[0] == -1) {
            return res;
        }
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target && (middle == nums.length - 1 || nums[middle + 1] != target)) {
                res[1] = middle;
                break;
            }
            if (nums[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return res;
    }
}
