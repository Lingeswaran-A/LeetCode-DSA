class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                arr.add(c-'0');
            }
        }
        int[] res=new int[arr.size()];;
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        if(res.length==0) return -1;
        int largest=res[0];
        int secondlargest=-1;
        for(int i=1;i<res.length;i++){
            if(res[i]>largest){
                secondlargest=largest;
                largest=res[i];
            }
            else if(res[i]>secondlargest && res[i]<largest){
                secondlargest=res[i];
            }
        }
        return secondlargest;
    }
}