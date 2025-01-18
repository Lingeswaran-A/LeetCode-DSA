class Solution {
    public int shortestPath(int[][] grid, int k) {
        int rows=grid.length;
        int cols=grid[0].length;
        int res=0;
        int[][] track=new int[rows][cols];
        for(int[] arr:track){
            Arrays.fill(arr,-1);
        }
        int[][] moves={{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0,k});
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int r=queue.peek()[0];
                int c=queue.peek()[1];
                int curr=queue.peek()[2];
                queue.poll();
                if(r==rows-1 && c==cols-1){
                    return res;
                }
                if(grid[r][c]==1) curr--;
                for(int[] move:moves){
                    int new_r=r+move[0];
                    int new_c=c+move[1];
                    if(new_r>=0 && new_c>=0 && new_r<rows && new_c<cols && track[new_r][new_c]<curr){
                        queue.add(new int[]{new_r,new_c,curr});
                        track[new_r][new_c]=curr;
                    }
                }
            }
            res++;
        }
        return -1;
    }
}