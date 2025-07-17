class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean vowel=false;
        boolean consonant=false;
        for(char c :word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                if(isvowel(c)){
                    vowel=true;
                }
                else consonant=true;
            }
        }
        return vowel && consonant;
    }
    public boolean isvowel(char a){
        char[] vowels={'a','e','i','o','u'};
        a=Character.toLowerCase(a);
        for(char i:vowels){
            if(a==i) return true;
        }
        return false;
    }
}