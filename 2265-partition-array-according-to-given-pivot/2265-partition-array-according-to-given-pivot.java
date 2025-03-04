class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] low=new int[nums.length];
        int[] high=new int[nums.length];
        int[] res=new int[nums.length];
        int count=0,ptr1=0,ptr2=0;
        for(int num:nums){
            if(num<pivot){
                low[ptr1]=num;
                ptr1++;
            }
            else if(num==pivot) count++;
            else{
                    high[ptr2]=num;
                    ptr2++;
            }
        }
        int ind=0;
        for(int a=0;a<ptr1;a++) res[ind++]=low[a];
        for(int a=0;a<count;a++) res[ind++]=pivot;
        for(int a=0;a<ptr2;a++) res[ind++]=high[a];
        return res;
    }
}