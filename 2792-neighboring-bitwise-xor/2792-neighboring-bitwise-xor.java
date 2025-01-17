class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int a=0,b=0;
        for(int n:derived){
            if(n==1) b=~b;
            else continue;
        }
        boolean flag=false;
        if(a==b) flag=true;
        return flag;
    }
}