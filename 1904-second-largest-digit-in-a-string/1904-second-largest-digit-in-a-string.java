class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int secondlargest=-1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int temp=c-'0';
                if(temp>largest){
                    secondlargest=largest;
                    largest=temp;
                }
                else if(temp>secondlargest && temp<largest){
                    secondlargest=temp;
                }
            }
        }
        return secondlargest;
    }
}