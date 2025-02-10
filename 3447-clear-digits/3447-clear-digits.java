class Solution {
    public String clearDigits(String s) {
        int res_len=0;
        char[] ch_arr=s.toCharArray();
        for(int ind=0;ind<s.length();ind++){
            if(Character.isDigit(s.charAt(ind))){
                res_len=Math.max(res_len-1,0);
            }
            else{
                ch_arr[res_len++]=s.charAt(ind);
            }
        }
        s=new String(ch_arr,0,res_len);
        return s;
    }
}