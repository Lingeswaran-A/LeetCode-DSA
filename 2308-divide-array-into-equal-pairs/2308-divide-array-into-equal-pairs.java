class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2==1) return false;
        int count = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(hash.containsKey(nums[i])) {
                count++;
                hash.remove(nums[i]);
            } else {
                hash.put(nums[i], 1);
            }
        }
        return (count == nums.length/2.0);
    }
}