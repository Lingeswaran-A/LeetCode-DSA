class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int[] diff=new int[n];
        for(int[] shift:shifts){
            if(shift[2]==1){
                diff[shift[0]]++;
                if(shift[1]+1<n){
                    diff[shift[1]+1]--;
                }
            }
            else{
                diff[shift[0]]--;
                if(shift[1]+1<n){
                    diff[shift[1]+1]++;
                }
            }
        }
        for (int i = 1; i < n; ++i) {
            diff[i] += diff[i - 1];
        }
        char[] chars=s.toCharArray();
        for(int i=0;i<n;i++){
            int shift = (diff[i] % 26 + 26) % 26; 
            int ch=chars[i]-'a';
            ch=(ch+shift)%26;
            chars[i]=(char) ('a'+ch);
        }
        return new String(chars);
    }
}