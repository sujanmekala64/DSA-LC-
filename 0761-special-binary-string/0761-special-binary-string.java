class Solution {
    public String makeLargestSpecial(String s) {
        int val=0,cnt=0;
        List<String> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') cnt++;
            else cnt--;
            if(cnt==0){
                ans.add("1"+makeLargestSpecial(s.substring(val+1,i))+"0");
                val=i+1;
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        return String.join("",ans);
    }
}