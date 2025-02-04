class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int cnt=0;
        String ans="";
        while(cnt<strs[0].length() && cnt<strs[strs.length-1].length()){
            if(strs[0].charAt(cnt)==strs[strs.length-1].charAt(cnt)){
                ans+=strs[0].charAt(cnt);
                cnt++;
            } 
            else break;
        }
        return ans;
    }
}