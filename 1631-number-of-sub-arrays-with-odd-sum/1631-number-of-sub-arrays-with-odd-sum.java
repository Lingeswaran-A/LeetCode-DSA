class Solution {
    public int numOfSubarrays(int[] arr) {
        final int mod=1000000007;
        long odd=0,even=1;
        long res=0;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum^=arr[i];
            if((sum&1)==1){
                res=(res+even)%mod;
                odd++;
            }
            else{
                res=(res+odd)%mod;
                even++;
            }   
        }
        return (int)res;
    }
}