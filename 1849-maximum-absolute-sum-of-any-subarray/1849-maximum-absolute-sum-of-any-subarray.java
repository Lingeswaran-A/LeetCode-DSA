class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0,min_sum=0,max_sum=0;
        for(int n:nums){
            sum+=n;
            if(sum>max_sum) max_sum=sum;
            if(sum<min_sum) min_sum=sum;
        }
        return Math.abs(max_sum-min_sum);
    }
}