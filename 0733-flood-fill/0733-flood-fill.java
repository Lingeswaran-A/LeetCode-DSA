class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        if(image[sr][sc]==color){
            return image;
        }
        int color_r=image[sr][sc];
        image[sr][sc]=color;

        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            for (int i = 0; i < 4; i++) {
                int new_row = r + drow[i];
                int new_col = c + dcol[i];
                if (new_row >= 0 && new_row < n && new_col >= 0 && new_col < m 
                    && image[new_row][new_col]==color_r){
                    image[new_row][new_col]=color;
                    queue.offer(new int[]{new_row, new_col});
                }
            }
        }
        return image;
    }
}