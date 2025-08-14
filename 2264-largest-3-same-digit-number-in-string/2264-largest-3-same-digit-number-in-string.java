class Solution {
    public String largestGoodInteger(String num) {
        int ans=-1;
        String ret="";
        for(int i=1;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1)){
                int val=num.charAt(i)-'0';
                if(val>ans){
                    ans=val;
                    ret=String.valueOf(num.charAt(i)).repeat(3);
                }
            }
        }
        return ret;
    }
}