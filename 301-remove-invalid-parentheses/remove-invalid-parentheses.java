class Solution {
    public void solve(int idx,String s,int cnt,String newstr,HashSet<String> set){
        if(cnt<0) return ;
        if(idx==s.length()){
            if(cnt==0) set.add(newstr);
            return ;
        }
        if(s.charAt(idx)=='('){
            solve(idx+1,s,cnt+1,newstr+'(',set);
            solve(idx+1,s,cnt,newstr,set);
        }
        else if(s.charAt(idx)==')'){
            solve(idx+1,s,cnt-1,newstr+')',set);
            solve(idx+1,s,cnt,newstr,set);
        }
        else{ //for remaining chars
            solve(idx+1,s,cnt,newstr+s.charAt(idx),set);
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        HashSet<String> set = new HashSet<>();
        solve(0,s,0,"",set);
        List<String> ans=new ArrayList<>();
        int maxcnt=0;
        for(String val:set) if(val.length()>maxcnt) maxcnt=val.length();
        for(String val:set) if(val.length()==maxcnt) ans.add(val);
        return ans;
    }
}