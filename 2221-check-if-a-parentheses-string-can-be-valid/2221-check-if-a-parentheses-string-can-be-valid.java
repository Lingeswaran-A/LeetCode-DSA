class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2==1){
            return false;
        }
        Stack<Integer> open=new Stack<>();
        Stack<Integer> release=new Stack<>();
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                release.push(i);
            }
            else if(s.charAt(i)=='('){
                open.push(i);
            }
            else if(s.charAt(i)==')' && !open.empty()){
                open.pop();
            }
            else if(s.charAt(i)==')' && !release.empty()){
                release.pop();
            }
            else return false;
        }
        while(!open.empty() && !release.empty() && open.peek()<release.peek()){
            open.pop();
            release.pop();
        }
        if(!open.empty()) return false;
        return true;
    }
}