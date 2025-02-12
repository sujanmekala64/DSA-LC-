class Solution {
    public String check(String s){
        String res="";
        boolean plus=false;
        boolean atthe = false;
        char p;
        for(int i=0;i<s.length();i++){
            p=s.charAt(i);
            if(atthe==false){
                if(p=='.') continue;
                if(p=='+') plus=true;
                else if(p=='@'){
                    res+=p;
                    atthe=true;
                }
                else if(plus==false) res+=p;
            }
            else res+=p;
        }
        return res;
    }
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();
        String temp;
        for(int i=0;i<emails.length;i++){
            temp = check(emails[i]);
            ans.add(temp);
        }
        return ans.size();
    }
}