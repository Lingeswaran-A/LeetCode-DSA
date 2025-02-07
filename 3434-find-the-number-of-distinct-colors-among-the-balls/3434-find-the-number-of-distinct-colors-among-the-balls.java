class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n=queries.length;
        int[] res=new int[n];
        Map<Integer,Integer> colormap=new HashMap<>();
        Map<Integer,Integer> ballmap=new HashMap<>();
        for(int i=0;i<n;i++){
            int b=queries[i][0];
            int c=queries[i][1];
            if(ballmap.containsKey(b)){
                int prev_c=ballmap.get(b);
                colormap.put(prev_c,colormap.get(prev_c)-1);
                if(colormap.get(prev_c)==0){
                    colormap.remove(prev_c);
                }
            }
            ballmap.put(b,c);
            colormap.put(c,colormap.getOrDefault(c,0)+1);
            res[i]=colormap.size();
        }
        return res;
    }
}