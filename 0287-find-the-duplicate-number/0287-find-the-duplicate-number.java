class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq=new int[nums.length+1];
        int ctr=0;
        while(ctr<nums.length){
            if(freq[nums[ctr]]!=0){
                return nums[ctr];
            }
            else freq[nums[ctr]]+=1;
            ctr++;
        }
        return 0;
    }
}