class Solution {
    public String iterate(String val){
        char p=val.charAt(0);
        int cnt=1;
        String ret="";
        for(int i=1;i<val.length();i++){
            char s=val.charAt(i);
            if(p==s) cnt++;
            else{
                ret+=(String.valueOf(cnt))+p;
                p=s;
                cnt=1;
            }
        }
        ret+=(String.valueOf(cnt))+p;
        return ret;
    }
    public String countAndSay(int n) {
        String ans="1";
        for(int i=1;i<n;i++){
            System.out.println(ans);
            ans=iterate(ans);
        }
        return ans;
    }
}