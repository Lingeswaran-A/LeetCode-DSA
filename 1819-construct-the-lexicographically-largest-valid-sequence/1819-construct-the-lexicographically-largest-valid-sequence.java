class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] res=new int[2*n-1];
        boolean[] visited=new boolean[n+1];
        backtrack_func(res,visited,n,0);
        return res;
    }
    public boolean backtrack_func(int[] res,boolean[] visited,int n,int ind){
        while(ind<res.length && res[ind]!=0){
            ind++;
        }
        if(ind==res.length) return true;
        for(int i=n;i>=1;i--){
            if(visited[i]) continue;
            if(i==1){
                res[ind]=1;
                visited[1]=true;
                if(backtrack_func(res,visited,n,ind+1)) return true;
                res[ind]=0;
                visited[1]=false;
            }
            else{
                if(ind+i<res.length && res[ind+i]==0){
                    res[ind]=i;
                    res[ind+i]=i;
                    visited[i]=true;
                    if(backtrack_func(res,visited,n,ind+1)) return true;
                    res[ind]=0;
                    res[ind+i]=0;
                    visited[i]=false;
                }
            }
        }
        return false;
    }
}