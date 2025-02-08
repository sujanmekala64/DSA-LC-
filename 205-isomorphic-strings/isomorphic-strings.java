class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n=s.length();
        int freq1[] = new int[200];
        int freq2[] = new int[200];
        for(int i=0;i<n;i++){
            if(freq1[s.charAt(i)]!=freq2[t.charAt(i)]) return false;
            freq1[s.charAt(i)]=i+1;
            freq2[t.charAt(i)]=i+1;
        }
        return true;
    }
}