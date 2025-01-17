class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res=0;
        for(int n:derived){
            res=res^n;
        }
        boolean flag=false;
        if(res==0) flag=true;
        return flag;
    }
}