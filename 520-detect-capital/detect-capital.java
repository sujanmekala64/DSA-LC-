class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()))
            return true;
        else if(word.equals(word.toLowerCase()))
            return true;
        String s1 = word.substring(1);
        if(Character.isUpperCase(word.charAt(0)) && (s1.equals(s1.toLowerCase())))
            return true;
        return false;
    }
}