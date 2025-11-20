class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind1=m-1, ind2=n-1;
        int right=m+n-1;
        while(ind2>=0){
            if(ind1>=0 && nums1[ind1]>nums2[ind2]){
                nums1[right]=nums1[ind1];
                ind1--;
            }
            else{
                nums1[right]=nums2[ind2];
                ind2--;
            }
            right--;
        }
    }
}