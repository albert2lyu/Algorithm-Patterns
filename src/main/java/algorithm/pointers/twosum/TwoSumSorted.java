package algorithm.pointers.twosum;

/**
 * Given an sorted array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */
public class TwoSumSorted {
    // Two Pointers: Time O(n), Space O(1)
    public int[] twoSumSorted(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
