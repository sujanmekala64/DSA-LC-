class Solution {
    public boolean checkRecord(String s) {
        int abs=0;
        int late=0;
        int ans=0;
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='A') abs++;
            else if(c=='L'){
                if(!st.isEmpty() && st.peek()=='L') late++;
                else late=1;
            }
            st.push(c); 
            ans=Math.max(ans,late);
        }
        return (abs<2)&&(ans<3);
    }
}