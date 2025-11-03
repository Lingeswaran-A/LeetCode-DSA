class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] distance=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                    distance[i][j]=0;
                }
                else{
                    distance[i][j]=-1;
                }
            }
        }
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0];
            int y=cur[1];
            int d=distance[x][y];

            for(int k=0;k<4;k++){
                int new_x=x+dx[k];
                int new_y=y+dy[k];

                if(new_x>=0 && new_y>=0 && new_x<n && new_y<m && distance[new_x][new_y]==-1){
                    distance[new_x][new_y]=d+1;
                    q.add(new int[]{new_x,new_y});
                }
            }
        }
        return distance;
    }
}