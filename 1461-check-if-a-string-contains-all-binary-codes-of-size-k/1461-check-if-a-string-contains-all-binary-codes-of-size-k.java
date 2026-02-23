class Solution {
    // public void generateSubstrings(int k,List<String> ans,String s){
    //     if(s.length()==k){
    //         ans.add(s);
    //         return ;
    //     }
    //     generateSubstrings(k,ans,s+'0');
    //     generateSubstrings(k,ans,s+'1');
    // }
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            set.add(s.substring(i,k+i));
        }
        return set.size()==(int)Math.pow(2,k);
    }
}