class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int max_end,max_far,min_end,min_far;
        max_end=max_far=min_end=min_far=nums[0];
        for(int ind=1;ind<n;ind++){
            max_end=Math.max(nums[ind],max_end+nums[ind]);
            min_end=Math.min(nums[ind],min_end+nums[ind]);
            max_far=Math.max(max_far,max_end);
            min_far=Math.min(min_far,min_end);
        }
        return Math.max(Math.abs(max_far),Math.abs(min_far));
    }
}