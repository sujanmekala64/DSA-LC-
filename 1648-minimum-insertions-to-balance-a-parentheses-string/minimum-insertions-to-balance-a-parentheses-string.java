class Solution {
    public int minInsertions(String s) {
        int count=0;
        int result=0;
        int idx=0;
        while(idx<s.length()){
            if(s.charAt(idx)=='('){
                count++;
                idx++;
            }
            else{
                if(count>0) count--;
                else result++;
                if(idx+1<s.length() && s.charAt(idx+1)==')'){
                    idx+=2;
                }
                else{
                    result++;
                    idx++;
                }
            }
        }
        return (count*2)+result;
    }
}