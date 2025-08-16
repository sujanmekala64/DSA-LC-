class Solution {
    public int maximum69Number (int num) {
        boolean check=false;
        String s=String.valueOf(num);
        String ans="";
        for(char p:s.toCharArray()){
            if(p=='6' && !check){
                check=true;
                ans+='9';
            }
            else ans+=p;
        }
        return Integer.parseInt(ans);
    }
}