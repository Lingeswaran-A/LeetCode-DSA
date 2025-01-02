class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] count = new int[words.length+1];
        for (int i=0;i<words.length;i++) {
            if (check_vowel(words[i])) {
                count[i+1]++;
            }
        }
        for (int i=1;i<=words.length;i++) {
            count[i]+= count[i-1];
        }
        int[] res = new int[queries.length];
        int i = 0;
        for (int[] q:queries) {
            int l = q[0];
            int r = q[1];
            res[i++] = count[r+1]-count[l];
        }
        return res;
    }
    public boolean check_vowel(String str) {
        return is_vowel(str.charAt(0)) && is_vowel(str.charAt(str.length()-1));
    }
    public boolean is_vowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}