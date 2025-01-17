class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        int res=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(did_koko_ate(mid,piles,h)){
                res=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return res;
    }
    public boolean did_koko_ate(int max,int[] piles,int h){
        int hour=0;
        for(int n:piles){
            hour+=(n+max-1)/max;
            if(hour>h) return false;
        }
        return hour<=h;
    }
}