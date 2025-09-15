class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String splits[] = text.split("\\s+");
        int ans=0;
        for(String split:splits){
            int cnt=0;
            for(int i=0;i<brokenLetters.length();i++){
                char p=brokenLetters.charAt(i);
                String s=p+"";
                if(split.contains(s)) break;
                else cnt++;
            }
            if(cnt==brokenLetters.length()) ans++;
        }
        return ans;
    }
}