class Solution {
    public long coloredCells(int n) {
        long res=0;
        for(int i=0;i<=n;i++){
            if(i==1) res=1;
            else{
                res+=(4*(i-1));
            }
        }
        return res;
    }
}