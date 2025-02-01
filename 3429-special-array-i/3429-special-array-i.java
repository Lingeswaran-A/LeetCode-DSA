class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        int ind;
        for(ind=0;ind<nums.length-1;ind++){
            if(!isParity(nums[ind],nums[ind+1])) return false;
            else continue; 
        }
        return true;
    }
    public boolean isParity(int a,int b){
        if((a%2!=0 && b%2==0) || (a%2==0 && b%2!=0)) return true;
        else return false;
    }
}