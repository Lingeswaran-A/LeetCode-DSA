class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hset=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int n: nums1){
            hset.add(n);
        }
        for(int n:nums2){
            if(hset.contains(n)){
                res.add(n);
            }
        }
        int[] ans=new int[res.size()];
        int ind=0;
        for(int k:res){
            ans[ind]=k;
            ind++;
        }
        return ans;
    }
}