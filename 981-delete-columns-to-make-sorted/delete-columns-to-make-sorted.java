class Solution {
    public int minDeletionSize(String[] strs) {
        int idx=0;
        int ans=0;
        while(idx<strs[0].length()){
            for(int i=1;i<strs.length;i++){
                if(strs[i].charAt(idx)<strs[i-1].charAt(idx)){
                    ans++;
                    break;
                }
            }
            idx++;
        }
        return ans;
    }
}