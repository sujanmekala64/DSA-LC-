class Solution {
    public int minSteps(String s, String t) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int cnt=0;
        for(char p:s.toCharArray()) arr1[p-'a']++;
        for(char p:t.toCharArray()) arr2[p-'a']++;
        for(int i=0;i<26;i++) cnt+=Math.abs(arr1[i]-arr2[i]);
        return cnt;
    }
}