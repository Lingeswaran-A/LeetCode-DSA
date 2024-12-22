class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int diff=target-n;
            if(hmap.containsKey(diff)){
                return new int[]{hmap.get(diff),i};
            }
            hmap.put(n,i);
        }
        return new int[]{};
    }
}