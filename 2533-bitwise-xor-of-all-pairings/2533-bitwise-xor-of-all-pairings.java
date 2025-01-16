class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0,xor2=0;
        int len1=nums1.length;
        int len2=nums2.length;
        if(len1%2==1){
            for(int n2:nums2){
                xor2=xor2^n2;
            }
        }
        if(len2%2==1){
            for(int n1:nums1){
                xor1=xor1^n1;
            }
        }
        return xor1^xor2;
    }
}