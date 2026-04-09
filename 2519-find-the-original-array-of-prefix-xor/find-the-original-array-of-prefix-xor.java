class Solution {
    public int[] findArray(int[] pref) {
        int ans=0;
        for(int i=0;i<pref.length;i++){
            pref[i]=pref[i]^ans;
            ans^=pref[i];
        }
        return pref;
    }
}