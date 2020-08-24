class Solution {
    int findKth(int[] nums1, int left1, int right1, int[] nums2, int left2, int right2, int k) {
        int len1 = right1 - left1;
        int len2 = right2 - left2;
        if (len1 > len2) {
            return findKth(nums2, left2, right2, nums1, left1, right1, k);
        }
        if (len1 == 0) {
            return nums2[left2 + k - 1];
        }
        if (k == 1) {
            return nums1[left1] < nums2[left2] ? nums1[left1] : nums2[left2];
        }
        int p1 = k / 2 < len1 ? k / 2 : len1;
        int p2 = k - p1;
        if (nums1[left1 + p1 - 1] < nums2[left2 + p2 - 1]) {
            return findKth(nums1, left1 + p1, right1, nums2, left2, right2, k - p1);
        } else if (nums1[left1 + p1 - 1] > nums2[left2 + p2 - 1]) {
            return findKth(nums1, left1, right1, nums2, left2 + p2, right2, k - p2);
        } else {
            return nums1[left1 + p1 - 1];
        }
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        return (findKth(nums1, 0, len1, nums2, 0, len2, (len1 + len2 + 1) / 2) + findKth(nums1, 0, len1, nums2, 0, len2, (len1 + len2 + 2) / 2)) / 2.0;
    }
}
