class Solution {
    public int reverse(int x) {
        return solver(x,0);
    }
    public int solver(int x,int rev){
        if(x==0) return rev;
        if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) return 0;
        int rem=x%10;
        x=x/10;
        rev=rev*10+rem;
        System.out.print(x+" "+rev+" "+rem);
        return solver(x,rev);
    }
}