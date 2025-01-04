class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letters=new HashSet<>();
        for(Character ch:s.toCharArray()){
            letters.add(ch);
        }
        int res=0;
        for(Character l:letters){
            int i=-1,j=0;
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==l){
                    if(i==-1){
                        i=k;
                    }
                    j=k;
                }
            }
            Set<Character> btw=new HashSet<>();
            for(int k=i+1;k<j;k++){
                btw.add(s.charAt(k));
            }
            res+=btw.size();
        }
        return res;
    }
}