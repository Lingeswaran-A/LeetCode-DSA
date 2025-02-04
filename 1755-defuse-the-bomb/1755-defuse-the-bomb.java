class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        if(k==0) return res;
        int start=1,end=k,cur_sum=0;
        if(k<0){
            start=code.length-Math.abs(k);
            end=code.length-1;
        }
        for(int i=start;i<=end;i++){
            cur_sum+=code[i];
        }
        for(int i=0;i<code.length;i++){
            res[i]=cur_sum;
            cur_sum-=code[(start)%code.length];
            cur_sum+=code[(end+1)%code.length];
            start++;
            end++;
        }
        return res;
    }
}