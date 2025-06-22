class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int total=(n+k-1)/k;
        String[] starr=new String[total];

        int ind=0;
        for(int i=0;i<n;i+=k){
            int end=Math.min(i+k,n);
            String grp=s.substring(i,end);

            if(grp.length()<k){
                int count=k-grp.length();
                for(int j=0;j<count;j++){
                    grp+=fill;
                }
            }
            starr[ind++]=grp;
        }
        return starr;
    }
}