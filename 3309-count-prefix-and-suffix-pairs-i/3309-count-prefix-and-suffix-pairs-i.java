class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String a=words[i];
                String b=words[j];
                if(a.length()>b.length()) continue;
                if(b.startsWith(a) && b.endsWith(a)){
                    ++count;
                }
            }
        }
        return count;
    }
}