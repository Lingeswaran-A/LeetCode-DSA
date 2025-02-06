class Solution {
    public int tupleSameProduct(int[] nums) {
        int numsLength = nums.length;
        Map<Integer, Integer> hmap = new HashMap<>();
        int res = 0;
        for (int ind = 0; ind < numsLength; ind++){
            for (int s_ind = ind + 1;s_ind < numsLength;s_ind++){
                hmap.put(nums[ind] * nums[s_ind],hmap.getOrDefault(nums[ind] * nums[s_ind],0)+1);
            }
        }
        for (int value : hmap.keySet()) {
            int count = hmap.get(value);
            int pair =((count-1)*count)/2;
            res+=8*pair;
        }
        return res;
    }
}