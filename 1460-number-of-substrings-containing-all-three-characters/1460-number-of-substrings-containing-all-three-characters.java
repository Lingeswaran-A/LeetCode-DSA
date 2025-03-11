class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int [] count=new int[200];
        for(int i=0,j=0;j<s.length();j++){
            count[s.charAt(j)-'a']++;
            while(count[0]>=1 && count[1]>=1 && count[2]>=1){
                count[s.charAt(i)-'a']--;
                i++;
            }
            ans=ans+i;
        }
        return ans;
    }
}