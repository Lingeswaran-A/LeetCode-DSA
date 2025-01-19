class Solution {
    public int trapRainWater(int[][] heightMap) {
        int row=heightMap.length;
        int col=heightMap[0].length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean[][] visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            visited[i][0]=true;
            visited[i][col-1]=true;
            pq.offer(new int[]{heightMap[i][0],i,0});
            pq.offer(new int[]{heightMap[i][col-1],i,col-1});
        }
        for(int i=0;i<col;i++){
            visited[0][i]=true;
            visited[row-1][i]=true;
            pq.offer(new int[]{heightMap[0][i],0,i});
            pq.offer(new int[]{heightMap[row-1][i],row-1,i});
        }
        int res=0;
        int[] row_dir={-1,0,1,0};
        int[] col_dir={0,-1,0,1};
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int h=curr[0];
            int r=curr[1],c=curr[2];
            for(int i=0;i<4;i++){
                int new_r=r+row_dir[i];
                int new_c=c+col_dir[i];
                if(new_r>=0 && new_r<row && new_c>=0 && new_c<col && !visited[new_r][new_c]){
                    res+=Math.max(0,h-heightMap[new_r][new_c]);
                    pq.offer(new int[]{Math.max(h,heightMap[new_r][new_c]),new_r,new_c});
                    visited[new_r][new_c]=true;
                }
            }
        }
        return res;
    }
}