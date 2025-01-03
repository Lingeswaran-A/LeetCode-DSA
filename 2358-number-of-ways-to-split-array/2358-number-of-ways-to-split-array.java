class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        int count=0,i=0;
        while(i<nums.length-1){
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                count++;
            }
            i++;
        }
        return count;
    }
}