class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char sign='+';
        for(int i=0;i<s.length();i++){
            char g=s.charAt(i);
            if(Character.isDigit(g)){
                int val=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val = val*10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(sign=='+'){
                    st.push(val);
                }
                else if(sign=='-'){
                    st.push(-val);
                }
                else if(sign=='*'){
                    st.push(val*st.pop());
                }
                else if(sign=='/'){
                    st.push(st.pop()/val);
                }
            }
            else if(g!=' '){
                sign=g;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}