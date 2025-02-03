class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int curr=1,res=1;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                if(count>0) curr+=1;
                else{
                    curr=2;
                    count=1;
                }
            }
            else if(nums[i-1]>nums[i]){
                if(count<0) curr+=1;
                else{
                    curr=2;
                    count=-1;
                }
            }
            else{
                curr=1;
                count=0;
            }
            res=Math.max(res,curr);
        }
        return res;

    }
}