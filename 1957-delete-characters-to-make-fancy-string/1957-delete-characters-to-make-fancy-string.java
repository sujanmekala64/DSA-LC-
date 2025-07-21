class Solution {
    public String makeFancyString(String s) {
        Stack<Character> st = new Stack<>();
        for(char p:s.toCharArray()){
            if(st.size()>=2){
                char f = st.pop();
                char f2 = st.peek();
                st.push(f);
                if(st.size()>=2 && p==f && p==f2){ }
                else st.push(p);
            }
            else st.push(p);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}