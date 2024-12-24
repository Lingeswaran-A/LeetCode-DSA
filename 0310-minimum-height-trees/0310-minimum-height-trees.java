class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1){
            return Collections.singletonList(0);
        }
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> leaves=new LinkedList<>();
        int[] degree=new int[n];
        for(int i=0;i<n;i++){
            degree[i]=adj.get(i).size();
            if(degree[i]==1){
                leaves.add(i);
            }
        }
        while(n>2){
            int size=leaves.size();
            n-=size; // Reduce the total node count
            for(int i=0;i<size;i++){
                int leaf=leaves.poll(); // Remove the leaf
                for(int neighbour:adj.get(leaf)){
                    degree[neighbour]--; // Decrease the degree of its neighbours
                    if(degree[neighbour]==1){
                        leaves.add(neighbour); // Add new leaf to the queue
                    }
                }
            }
        }
        return new ArrayList<>(leaves);
    }
}