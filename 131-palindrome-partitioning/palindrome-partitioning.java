class Solution {
    List<List<String>> ans = new ArrayList<>();
    public void check(String s,int n,List<String> li){
        if(n==s.length()){
            ans.add(new ArrayList<>(li));
            return ;
        }
        for(int i=n;i<s.length();i++){
            if(palindrome(s,n,i)){
                li.add(s.substring(n,i+1));
                check(s,i+1,li);
                li.remove(li.size()-1);
            }
        }
    }
    public boolean palindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<String> li = new ArrayList<>();
        check(s,0,li);
        return ans;
    }
}