class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(ispal(word))return word;
        }
        return "";
    }
    public boolean ispal(String word){
        StringBuilder str=new StringBuilder(word);
        return word.equals(str.reverse().toString());
    }
}