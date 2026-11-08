class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(ispal(word))return word;
        }
        return "";
    }
    public boolean ispal(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}