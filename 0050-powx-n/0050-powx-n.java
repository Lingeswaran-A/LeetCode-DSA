class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long cp=n;
        if(cp<0) cp=-1*cp;
        while(cp>0){
            if(cp%2==0){
                x=x*x;
                cp=cp/2;
            }
            else{
                ans=ans*x;
                cp=cp-1;
            }
        }
        if(n<0) ans=(double)1.0/(double)ans;
        return ans;
    }
}