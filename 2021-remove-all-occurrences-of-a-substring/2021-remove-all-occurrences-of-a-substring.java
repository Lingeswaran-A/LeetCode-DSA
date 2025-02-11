class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stk=new Stack<>();
        int n=s.length();
        int m=part.length();
        for(int ind=0;ind<n;ind++){
            stk.push(s.charAt(ind));
            if(stk.size()>=m && check(stk,part,m)){
                for(int j=0;j<m;j++){
                    stk.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        } 
        sb.reverse();
        return sb.toString();
    }
    public boolean check(Stack<Character> stk,String part,int len){
        Stack<Character> temp=new Stack<>();
        temp.addAll(stk);
        for(int ind=len-1;ind>=0;ind--){
            if(temp.isEmpty() || temp.peek()!=part.charAt(ind)){
                return false;
            }
            temp.pop();
        }
        return true;
    }
}