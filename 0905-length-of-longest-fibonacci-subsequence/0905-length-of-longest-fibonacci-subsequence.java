class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if(arr.length<=2) return 0;
        int n=arr.length;
        Map<Integer, Integer> indmap=new HashMap<>();
        for(int i=0;i<n;i++){
            indmap.put(arr[i],i);
        }
        int maximum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prev_1=arr[j];
                int prev_2=arr[i];
                int len=2;
                while(indmap.containsKey(prev_1+prev_2)){
                    len++;
                    maximum=Math.max(maximum,len);
                    int temp=prev_1;
                    prev_1=prev_1+prev_2;
                    prev_2=temp;
                }
            }
        }
        return maximum>2 ? maximum:0;
    }
}