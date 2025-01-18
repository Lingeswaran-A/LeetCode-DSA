class Solution {
    public int minCost(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] dist=new int[m][n];
        for(int[] row:dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        LinkedList<int[]> queue=new LinkedList<>();
        int[] dx={0,0,1,-1},dy={1,-1,0,0};
        queue.addFirst(new int[]{0,0}); 
        dist[0][0]=0;
        while(!queue.isEmpty()){
            int[] curr=queue.removeFirst();
            int x=curr[0],y=curr[1];
            for(int dir=0;dir<4;dir++){
                int nx = x + dx[dir], ny = y + dy[dir];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int cost = dist[x][y] + (dir == grid[x][y] - 1 ? 0 : 1);
                    if (cost < dist[nx][ny]) {
                        dist[nx][ny] = cost;
                        if (dir == grid[x][y] - 1) {
                            queue.addFirst(new int[]{nx, ny});
                        } 
                        else{
                            queue.addLast(new int[]{nx, ny}); 
                        }
                    }
                }
            }
        }       
        return dist[m-1][n-1];
    }
}