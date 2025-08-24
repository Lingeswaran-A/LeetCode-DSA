class Solution {
    public int longestSubarray(int[] nums) {
        int res=0;
        int i=0,j=0,k=0;
        while(j<nums.length){
            if(nums[j]==0){
                k++;
            }
            while(k>1){
                if(nums[i]==0){
                    k--;
                }
                i++;
            }
            res=Math.max(res,j-i);
            j++;
        }
        return res;
    }
}