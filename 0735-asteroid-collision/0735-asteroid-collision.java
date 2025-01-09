class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<=n-1;i++){
            boolean flag=true;
            while(!stk.isEmpty() && asteroids[i]<0 && stk.peek()>0){
                if(stk.peek() < -asteroids[i]){
                    stk.pop();
                    continue;
                }
                else if(stk.peek()==-asteroids[i]){
                    stk.pop();
                }
                flag=false;
                break;
            }
            if(flag){
                stk.push(asteroids[i]);
            }
        }
        int[] res=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            res[i]=stk.pop();
        }
        return res;
    }
}