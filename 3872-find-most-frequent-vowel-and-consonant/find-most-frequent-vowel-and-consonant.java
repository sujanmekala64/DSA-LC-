class Solution {
    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        return false;
    }
    public int maxFreqSum(String s) {
        int vocnt=0;
        int cocnt=0;
        int arr[] = new int[26];
        for(char p:s.toCharArray()){
            arr[p-'a']++;
            if(isVowel(p)){
                if(arr[p-'a']>vocnt) vocnt=arr[p-'a'];
            }
            else{
                if(arr[p-'a']>cocnt) cocnt=arr[p-'a'];
            }
        }
        return (vocnt+cocnt);
    }
}