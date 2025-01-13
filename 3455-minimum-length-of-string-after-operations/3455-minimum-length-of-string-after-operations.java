class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        int total=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int n:freq){
            if(n==0) continue;
            if(n%2==0) total+=2;
            else total+=1;
        }
        return total;
    }
}