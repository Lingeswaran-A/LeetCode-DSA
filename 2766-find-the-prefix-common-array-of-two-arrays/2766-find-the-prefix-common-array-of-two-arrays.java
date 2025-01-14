class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] C=new int[n];
        Set<Integer> A_values=new HashSet<Integer>();
        Set<Integer> B_values=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            A_values.add(A[i]);
            B_values.add(B[i]);
            int count=0;
            for(int a:A_values){
                if(B_values.contains(a)){
                    count++;
                }
            }
            C[i]=count;
        }
        return C;
    }
}