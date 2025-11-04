class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;

        if(n==1) return 1;
        int[][] directions={
            {-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}
        };
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[n][n];
        q.offer(new int[]{0,0,1});
        visited[0][0]=true;

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            int dist=curr[2];

            if(r==n-1 && c==n-1) return dist;
            for(int[] d: directions){
                int new_r=r+d[0];
                int new_c=c+d[1];
                if(new_r>=0 && new_r<n && new_c>=0 && new_c<n && 
                    grid[new_r][new_c]==0 && !visited[new_r][new_c]){
                        visited[new_r][new_c]=true;
                        q.offer(new int[]{new_r,new_c,dist+1});
                }
            }
        }
        return -1;
    }
}