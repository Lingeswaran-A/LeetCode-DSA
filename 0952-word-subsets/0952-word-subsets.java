class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] max_freq=new int[26];
        int[] temp_freq=new int[26];
        for(String word:words2){
            Arrays.fill(temp_freq,0);
            for(char ch:word.toCharArray()){
                temp_freq[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                max_freq[i]=Math.max(max_freq[i],temp_freq[i]);
            }
        }
        List<String> words=new ArrayList<>();
        for(String word:words1){
            Arrays.fill(temp_freq,0);
            for(char ch:word.toCharArray()){
                temp_freq[ch-'a']++;
            }
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(max_freq[i]>temp_freq[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                words.add(word);
            }
        }
        return words;
    }
}