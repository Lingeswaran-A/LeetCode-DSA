class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[] freq_row=new int[row];
        int[] freq_col=new int[col];
        Map<Integer, int[]> hmap=new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                hmap.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;i++){
            int[] index=hmap.get(arr[i]);
            int r=index[0],c=index[1];
            freq_row[r]++;
            freq_col[c]++;
            if(freq_row[r]==col || freq_col[c]==row){
                return i;
            }
        }
        return -1;
    }
}