class Solution {
    public String clearDigits(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z') st.push(i);
            else st.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char p = s.charAt(st.pop());
            sb.append(p);
        }
        return sb.reverse().toString();
    }
}