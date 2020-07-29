class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == -nums[i]) {
                    if (left - i >= 2 && nums[left] == nums[left - 1]) {
                        left++;
                        right--;
                        continue;
                    }
                    List element = new ArrayList<Integer>();
                    element.add(nums[i]);
                    element.add(nums[left]);
                    element.add(nums[right]);
                    res.add(element);
                    left++;
                    right--;
                } else if (nums[left] + nums[right] > -nums[i]) {
                    right--;
                } else if (nums[left] + nums[right] < -nums[i]){
                    left++;
                }
            }
        }
        return res;
    }
}
