class Solution {
    public int totalSteps(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int[] steps=new int[nums.length];
        int max=0;
        for(int i=nums.length-1;i>=0;i--){
            while(!stk.isEmpty() && nums[i]>nums[stk.peek()]){
                steps[i]=Math.max(steps[i]+1,steps[stk.pop()]);
            }
            stk.push(i);
            max=Math.max(max,steps[i]);
        }
        return max;
    }
}