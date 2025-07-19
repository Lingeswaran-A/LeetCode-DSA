class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int[] result=new int[Math.min(nums1.length, nums2.length)];
        int index=0;
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                int b = nums2[j];
                if (a == b) {
                    if (index == 0 || result[index - 1] != a) {
                        result[index++] = a;
                    }
                    break;  
                } else if (a < b) {
                    break; 
                }
            }
        }
        int[] res=Arrays.copyOf(result,index);
        return res;
    }
}