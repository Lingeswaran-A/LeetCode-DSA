class Solution {
    public int findClosest(int x, int y, int z) {
        int fp_diff=0;
        int sp_diff=0;
        fp_diff=Math.abs(z-x);
        sp_diff=Math.abs(z-y);
        if(fp_diff<sp_diff) return 1;
        else if(sp_diff<fp_diff) return 2;
        else return 0;
    }
}