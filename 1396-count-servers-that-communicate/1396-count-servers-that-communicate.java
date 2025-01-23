class Solution {
    public int countServers(int[][] grid) {
        int res=0;
        int row=grid.length,col=grid[0].length;
        boolean[] rows=new boolean[row];
        for(int r=0;r<row;r++){
            int count=sum(grid[r]);
            if(count>1){
                res+=count;
                rows[r]=true;
            }
        }
        for(int c=0;c<col;c++){
            int counted=0,total=0;
            for(int r=0;r<row;r++){
                if(grid[r][c]==1){
                    total++;
                    if(rows[r]) counted++;
                }
            }
            if(total>1) res+=total-counted;
        }
        return res;
    }
    public int sum(int[] nums){
        int s=0;
        for(int n:nums){
            s+=n;
        }
        return s;
    }
}  