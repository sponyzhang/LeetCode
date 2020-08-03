class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = 1;
        int cur = nums[0];       
        for (int i = 1; i < nums.length; i++) {
            if (cur == nums[i]) {
                continue;
            } else {
                nums[len++] = nums[i];
                cur = nums[i];
            }
        }
        return len;
    }
}
