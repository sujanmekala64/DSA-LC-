class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String splits[] = s.split("\\s+");
        String st="";
        for(int i=splits.length-1;i>=0;i--){
            st+=splits[i];
            if(i!=0) st+=" "; 
        }
        return st;
    }
}