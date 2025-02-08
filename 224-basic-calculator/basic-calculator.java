class Solution {
    public int calculate(String s) {
        int sum=0;
        int sign=1;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            char g=s.charAt(i);
            if(Character.isDigit(g)){
                int val=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                val=val*sign;
                sign=1;
                sum=sum+val;
            }
            else if(g=='('){
                st.push(sum);
                st.push(sign);
                sum=0;
                sign=1;
            }
            else if(g==')'){
                sum=sum*st.pop();
                sum=sum+st.pop();
            }
            else if(g=='-') sign*=-1;
        }
        return sum;
    }
}