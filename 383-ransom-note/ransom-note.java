class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rarr[] = new int[26];
        int marr[] = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            int val = ransomNote.charAt(i)-'a';
            rarr[val]++;
        }
        for(int i=0;i<magazine.length();i++){
            int val = magazine.charAt(i)-'a';
            marr[val]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int val = ransomNote.charAt(i)-'a';
            if(rarr[val]>marr[val]) return false;
        }
        return true;
    }
}