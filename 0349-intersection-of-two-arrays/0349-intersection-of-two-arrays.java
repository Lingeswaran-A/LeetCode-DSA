class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hset=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int num:nums1){
            hset.add(num);
        }
        for(int num:nums2){
            if(hset.contains(num)){
                res.add(num);
            }
        }
        int[] ans=new int[res.size()];
        int ind=0;
        for(int num:res){
            ans[ind]=num;
            ind++;
        }
        return ans;
    }
}