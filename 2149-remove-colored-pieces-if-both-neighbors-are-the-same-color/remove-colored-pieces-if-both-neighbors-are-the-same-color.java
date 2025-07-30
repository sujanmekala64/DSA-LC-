class Solution {
    public boolean winnerOfGame(String colors) {
        Stack<Character> st = new Stack<>();
        int al=0;
        int bo=0;
        if(colors.length()<=2) return false;
        st.push(colors.charAt(0));
        st.push(colors.charAt(1));
        boolean check=false;
        for(int i=2;i<colors.length();i++){
            char p=colors.charAt(i);
            char prev=st.pop();
            if(p=='A' && prev=='A' && st.peek()=='A'){
                check=true;
                al++;
            }
            else if(p=='B' && prev=='B' && st.peek()=='B'){
                check=true;
                bo++;
            }
            st.push(prev);  
            if(!check) st.push(p);
            check=false;
        }
        if(al==0) return false;
        return al>bo;
    }
}