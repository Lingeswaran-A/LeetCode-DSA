class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set=new HashSet<>(Arrays.asList(words));
        Map<String,Boolean> memo_map=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(String s:words){
            if(concatable(s,set,memo_map))
                res.add(s);
        }
        return res;
    }
    public boolean concatable(String s,Set<String> set,Map<String,Boolean> memo_map){
        if(memo_map.containsKey(s) && !memo_map.get(s)) return false;
        for(int i=1;i<s.length();i++){
            String prefix=s.substring(0,i);
            String suffix=s.substring(i);
            if(set.contains(prefix) && (set.contains(suffix) || concatable(suffix,set,memo_map))){
                memo_map.put(s,true);
                return true;
            }
        }
        memo_map.put(s,false);
        return false;
    }
}