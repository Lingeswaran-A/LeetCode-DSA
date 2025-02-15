class Solution {
    public int punishmentNumber(int n) {
        int num=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            if(can_partition(sq,i)){
                num+=sq;
            }
        }
        return num;
    }
    public boolean can_partition(int num,int target){
        if(num<target || target<0)
          return false;
        if(num == target)
          return true;
        return (can_partition(num/10,target-(num%10)) || 
                can_partition(num/100,target-(num%100)) || 
                can_partition(num/1000,target-(num%1000)));
    }
}