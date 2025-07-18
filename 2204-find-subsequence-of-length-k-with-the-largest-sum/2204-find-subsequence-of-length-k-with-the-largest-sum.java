class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->Integer.compare(a[0], b[0]));
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size()>k) pq.poll();
        }
        int[][] topk=pq.toArray(new int[0][0]);
        for(int i=0;i<topk.length-1;i++){
            for(int j=i+1;j<topk.length;j++){
                if(topk[i][1] > topk[j][1]){
                    int[] temp=topk[i];
                    topk[i] = topk[j];
                    topk[j] = temp;
                }
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=topk[i][0];
        }
        return res;
    }
}