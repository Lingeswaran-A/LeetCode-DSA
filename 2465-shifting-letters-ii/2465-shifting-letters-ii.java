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
        StringBuilder res=new StringBuilder(s);
        int num_of_shift=0;
        for(int i=0;i<n;i++){
            num_of_shift=(num_of_shift+diff[i])%26;
            if(num_of_shift<0){
                num_of_shift+=26;
            }
            char shift_ch=(char)('a'+((s.charAt(i)-'a'+num_of_shift)%26));
            res.setCharAt(i,shift_ch);
        }
        return res.toString();
    }
}