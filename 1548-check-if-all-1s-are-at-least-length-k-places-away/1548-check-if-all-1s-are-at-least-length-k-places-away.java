class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean isValid=true;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(index!=-1 && i-index-1<k){
                    isValid=false;
                }
                index=i;
            }
        }
        return isValid;
    }
}