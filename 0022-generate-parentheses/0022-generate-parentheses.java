class Solution {
    public boolean valid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(st.isEmpty() && p==')') return false;
            else if(p=='(') st.push(p);
            else st.pop();
        }
        return st.size()==0;
    }
    public void helper(int n,List<Character> li,List<String> ans){
        if(li.size()==2*n){
            String s="";
            for(int i=0;i<li.size();i++) s+=li.get(i);
            if(valid(s)){
                ans.add(s);
            }
            return ;
        }
        li.add('(');
        helper(n,li,ans);
        li.remove(li.size()-1);
        li.add(')');
        helper(n,li,ans);
        li.remove(li.size()-1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        List<Character> li=new ArrayList<>();
        helper(n,li,ans);
        return ans;
    }
}