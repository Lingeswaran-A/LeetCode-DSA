class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->Integer.compare(a[0], b[0]));
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size()>k) pq.poll();
        }
        List<int[]> list = new ArrayList<>(pq);
        list.sort(Comparator.comparingInt(a -> a[1]));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i)[0];
        }
        return res;
    }
}