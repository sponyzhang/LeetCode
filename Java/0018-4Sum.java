class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length < 4) {
            return res;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = nums.length - 1;
                int newTarget = target - nums[i] - nums[j];
                while (left < right) {
                    int tmp = nums[left] + nums[right];
                    if (tmp == newTarget) {
                        List<Integer> element = new ArrayList<Integer>();
                        element.add(nums[i]);
                        element.add(nums[j]);
                        element.add(nums[left]);
                        element.add(nums[right]);
                        res.add(element);
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (tmp < newTarget) {
                        left++;
                    } else if (tmp > newTarget) {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
