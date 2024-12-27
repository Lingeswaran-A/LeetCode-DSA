class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int max_left=values[0];
        int max_score=0;
        for(int i=1;i<n;i++){
            int cur_right=values[i]-i;
            max_score=Math.max(max_score,max_left+cur_right);
            int cur_left=values[i]+i;
            max_left=Math.max(max_left,cur_left);
        }
        return max_score;
    }
}