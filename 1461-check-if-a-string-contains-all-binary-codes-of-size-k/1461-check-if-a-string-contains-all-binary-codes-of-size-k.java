class Solution {
    public void generateSubstrings(int k,List<String> ans,String s){
        if(s.length()==k){
            ans.add(s);
            return ;
        }
        generateSubstrings(k,ans,s+'0');
        generateSubstrings(k,ans,s+'1');
    }
    public boolean hasAllCodes(String s, int k) {
        List<String> ans = new ArrayList<>();
        generateSubstrings(k,ans,"");
        int idx=0;
        HashSet<String> set = new HashSet<>();
        String substr="";
        while(idx<=s.length()-k){
            substr=s.substring(idx,k+idx);
            if(!set.contains(substr) && ans.contains(substr)) set.add(substr);
            idx++;
        }
        return set.size()==ans.size();
    }
}