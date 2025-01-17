class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch_arr=str.toCharArray();
            Arrays.sort(ch_arr);
            String st=String.valueOf(ch_arr);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(str);
        }
        return new ArrayList<>(map.values());
    }
}