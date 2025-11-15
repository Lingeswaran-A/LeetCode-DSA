class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1, sum=0;
        int leftbar=height[l];
        int rightbar=height[r];
        while(l<r){
            if(leftbar<=rightbar){
                sum+=leftbar-height[l];
                l++;
                leftbar=Math.max(height[l],leftbar);
            }
            else{
                sum+=rightbar-height[r];
                r--;
                rightbar=Math.max(height[r],rightbar);
            }
        }
        return sum;
    }
}