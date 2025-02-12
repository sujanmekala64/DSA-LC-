class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        int size=n-k;
        if(n==k) return "0";
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char p = num.charAt(i);
            int val=p-'0';
            while(!st.isEmpty() && k!=0 && st.peek()>val){
                st.pop();
                k--;
            }
            st.push(val);
        }
        while(k!=0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ans = sb.reverse().toString();
        int c=0;
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='0') c++;
        }
        return ans.length()==c?ans.replaceFirst("^0*","0"):ans.replaceFirst("^0*","");
    }
}