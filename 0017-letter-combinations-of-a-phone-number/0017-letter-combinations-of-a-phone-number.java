class Solution {
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        LinkedList<String> res=new LinkedList<>();
        if(digits.length()==0){
            return res;
        }
        res.add("");
        String[] char_map=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++){
            int index=Character.getNumericValue(digits.charAt(i));
            while(res.peek().length()==i){
                String permute=res.remove();
                for(char ch:char_map[index].toCharArray()){
                    res.add(permute+ch);
                }
            }
        }
        return res;
    }
}