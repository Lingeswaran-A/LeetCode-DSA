class Solution {
    public int minimizeXor(int num1, int num2) {
        int bits=count_bits(num2);
        int res=0;
        for(int i=31;i>=0 && bits>0;i--){
            if((num1&(1<<i))!=0){
                res=res|(1<<i);
                bits--;
            }
        }
        for(int i=0;i<32 && bits>0;i++){
            if((res&(1<<i))==0){
                res=res|(1<<i);
                bits--;
            }
        }
        return res;
    }
    public int count_bits(int num){
        int count=0;
        while(num!=0){
            count+=num&1;
            num>>=1;
        }
        return count;
    }
}