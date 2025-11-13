class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recursion_permute(0, nums, ans);
        return ans;
    }
    public void recursion_permute(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i, index, nums);
            recursion_permute(index+1,nums,ans);
            swap(i, index, nums);
        }
    }
    public void swap(int m, int n, int[] nums){
        int temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
}