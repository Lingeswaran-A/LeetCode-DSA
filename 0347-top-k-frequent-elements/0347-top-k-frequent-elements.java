class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hmap=new HashMap<>();
        List<Integer>[] freq_list=new ArrayList[nums.length+1];
        for(int n:nums){
            hmap.put(n,hmap.getOrDefault(n,0)+1);
        }
        for(int i=0;i<freq_list.length;i++){
            freq_list[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> hmap_entry:hmap.entrySet()) {
            int num=hmap_entry.getKey();
            int c=hmap_entry.getValue();
            freq_list[c].add(num);
        }
        int[] res=new int[k];
        int ind=0;
        for(int i=freq_list.length-1;i>=0;i--){
            for(int n:freq_list[i]){
                res[ind++]=n;
                if(ind==k){
                    return res;
                }
            }
        }
        return res;
    }
}