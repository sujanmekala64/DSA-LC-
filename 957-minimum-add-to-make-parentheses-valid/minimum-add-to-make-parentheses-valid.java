class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(p=='(') st.push(p);
            else if(!st.isEmpty()){
                char d = st.peek();
                if(d=='(' && p==')') st.pop();
                else if(p==')') st.push(p);
            }
            else if(p==')') st.push(p);
        }
        int cnt=0;
        while(!st.isEmpty()){
            cnt++;
            st.pop();
        }
        return cnt;
    }
}