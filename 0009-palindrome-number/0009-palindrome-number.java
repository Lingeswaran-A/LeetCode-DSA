class Solution {
    public boolean isPalindrome(int x) {
        String str1=Integer.toString(x);
        StringBuilder sb=new StringBuilder(str1);
        sb=sb.reverse();
        String str2=sb.toString();
        if(str1.equals(str2)) return true;
        else return false;
    }
}