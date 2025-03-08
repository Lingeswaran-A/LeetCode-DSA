class Solution {
    public int minimumRecolors(String blocks, int k) {
        int op=0;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<k;j++){
                if(blocks.charAt(j)=='W'){
                    op++;
                }
        }
        min=op;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W') op--;
            if(blocks.charAt(i)=='W') op++;
            min=Math.min(min,op);
        }
        return min;
    }
}