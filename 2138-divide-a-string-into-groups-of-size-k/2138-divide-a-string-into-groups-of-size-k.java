class Solution {
    public String[] divideString(String s, int k, char fill) {
        int val = (int)(Math.ceil((double)s.length()/k));
        String ans[] = new String[val];
        int idx=0;
        int cnt=0;
        int remofx = (k*val)-(s.length());
        while(true){
            if(cnt+k<=s.length()){
                ans[idx]=s.substring(cnt,cnt+k);
            } 
            if(cnt+k>s.length()) break; 
            cnt+=k;
            idx++;
        }
        if(cnt>=s.length()) return ans;
        String rem="";
        while(cnt<s.length()){
            rem+=s.charAt(cnt);
            cnt++;
        }
        while(remofx>0){
            rem+=fill;
            remofx--;
        }
        ans[val-1]=rem;
        return ans;
    }
}