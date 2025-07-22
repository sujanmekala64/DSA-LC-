class Solution {
    public int divisorSubstrings(int num, int k) {  //can be done using substring but donw with sliding window
        String n = String.valueOf(num);
        String s="";
        for(int i=0;i<k;i++) s+=n.charAt(i);
        int ans=0;
        int val=Integer.valueOf(s);
        if(num%val==0) ans++;
        for(int i=k;i<n.length();i++){
            s = s.substring(1,k)+(n.charAt(i));
            val=Integer.valueOf(s);
            if(val!=0 && num%val==0) ans++;
        }
        return ans;
    }
}