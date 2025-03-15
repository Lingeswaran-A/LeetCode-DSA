class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        while (low < high) {
            int mid = (low + high) / 2;
            if (canRobWithCapability(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean canRobWithCapability(int[] nums, int k, int cap) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= cap) {
                count++;
                i++;
            }
            i++;
        }
        return count >= k;
    }
}