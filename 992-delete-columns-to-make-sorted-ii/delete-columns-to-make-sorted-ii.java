class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        boolean sortedcol[] = new boolean[strs.length];
        boolean check=false;
        for(int i=0;i<strs[0].length();i++){
            check=false;
            for(int j=0;j<strs.length-1;j++){
                if(!sortedcol[j] && strs[j].charAt(i)>strs[j+1].charAt(i)){
                    check=true;
                    ans++;
                    break;
                }
            }
            if(check) continue;
            for(int k=0;k<strs.length-1;k++){
                sortedcol[k]=sortedcol[k]|(strs[k].charAt(i)<strs[k+1].charAt(i));
            }
        }
        return ans;
    }
}