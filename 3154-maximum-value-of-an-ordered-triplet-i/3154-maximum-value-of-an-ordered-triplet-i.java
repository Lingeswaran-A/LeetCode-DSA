class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=0,imax=0,dmax=0;
        for(int k=0;k<nums.length;k++){
            max=Math.max(max,dmax*nums[k]);
            dmax=Math.max(dmax,imax-nums[k]);
            imax=Math.max(imax,nums[k]);
        }
        return max;
    }
}