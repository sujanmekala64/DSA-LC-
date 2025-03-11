class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int l=0;
        int r=0;
        int cnt=0;
        while(r<s.length()){
            freq[s.charAt(r)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                cnt+=s.length()-r;
                freq[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return cnt;
    }
}