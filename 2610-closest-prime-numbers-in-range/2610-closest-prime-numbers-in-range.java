class Solution {
    public int[] closestPrimes(int left, int right) {
        int res[]=new int[2];
        int nums1=-1;
        int nums2=-1;
        boolean arr[]=new boolean[right+1];
        for(int i=2;i*i<=right;i++){
            if(arr[i]==false){
                for(int j=i*i;j<=right;j+=i)
                arr[j]=true;
            }
        }
        arr[1]=true;
        int minDist=Integer.MAX_VALUE;
        int prev=-1;
        boolean check=false;
        for(int i=left;i<=right;i++){
            if(!arr[i]){
            if(prev!=-1&&i-prev<minDist){
                minDist=i-prev;
                nums1=prev;
                nums2=i;
            }
            prev=i;
            }
        }
        if(nums1!=-1&&nums2!=-1){
            res[0]=nums1;
            res[1]=nums2;
            return res;
        }
        return new int[]{-1,-1};
    }
}