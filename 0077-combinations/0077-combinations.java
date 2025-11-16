class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        backtrack(1, combination, ans,n,k);
        return ans;
    }
    public void backtrack(int start, List<Integer> lst,List<List<Integer>> ans,int n, int k){
        if(lst.size()==k){
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int num=start;num<=n;num++){
            lst.add(num);
            backtrack(num+1,lst,ans,n,k);
            lst.remove(lst.size()-1);
        }
    }
}