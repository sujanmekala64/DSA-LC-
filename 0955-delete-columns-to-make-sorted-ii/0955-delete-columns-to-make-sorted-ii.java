class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if((!set.contains(j) || !set.contains(j-1)) && strs[j].charAt(i)<strs[j-1].charAt(i)){
                    ans++;
                    break;
                }
                else if(strs[j].charAt(i)>strs[j-1].charAt(i)){
                    set.add(j);
                    set.add(j-1);
                }
            }
            if(set.size()==strs.length) break;
        }
        return ans;
    }
}