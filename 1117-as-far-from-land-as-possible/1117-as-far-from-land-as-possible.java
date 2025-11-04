class Solution {
    public int maxDistance(int[][] grid) {
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) q.offer(new int[]{i,j});
            }
        }
        if(q.isEmpty() || q.size()==n*n) return -1;
        int res=-1;
        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int size=q.size();
            res++;
            while(size>0){
                size--;
                int[] cell=q.poll();
                int x=cell[0], y=cell[1];
                for(int[] dir: direction){
                    int i=x+dir[0], j=y+dir[1];
                    if(i>=0 && i<n && j>=0 && j<n && grid[i][j]==0){
                        grid[i][j]=1;
                        q.offer(new int[]{i, j});
                    }
                }
            }
        }
        return res;
    }
}