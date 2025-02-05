class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int p1=-1,p2=-1;
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>2) return false;
                if(p1==-1) p1=i;
                else p2=i;
            }
        }
        if(count==0) return true;
        if(count!=2) return false;
        return s1.charAt(p1)==s2.charAt(p2) && s1.charAt(p2)==s2.charAt(p1);
    }
}