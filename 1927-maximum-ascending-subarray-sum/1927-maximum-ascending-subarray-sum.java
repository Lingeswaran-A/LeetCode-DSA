class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr_sum=nums[0];
        int res=curr_sum;
        for(int i=1;i<nums.length;i++){
            curr_sum=(nums[i-1]<nums[i]) ? curr_sum+nums[i] : nums[i];
            res=Math.max(res,curr_sum);
        }
        return res;
    }
}