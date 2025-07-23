class Solution {
    public int removeab(String s,int x,int y){
        Stack<Character> st = new Stack<>();
        int cnt=0;
        for(char p:s.toCharArray()){
            if(!st.isEmpty() && st.peek()=='a' && p=='b'){
                st.pop();
                cnt+=x;
            }
            else st.push(p);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){ //check for ba
            sb.append(st.pop());
        }
        for(char p:sb.reverse().toString().toCharArray()){
            if(!st.isEmpty() && st.peek()=='b' && p=='a'){
                st.pop();
                cnt+=y;
            }
            else st.push(p);
        }
        return cnt;
    }
    public int removeba(String s,int x,int y){
        Stack<Character> st = new Stack<>();
        int cnt=0;
        for(char p:s.toCharArray()){
            if(!st.isEmpty() && st.peek()=='b' && p=='a'){
                st.pop();
                cnt+=y;
            }
            else st.push(p);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){ //ab 
            sb.append(st.pop());
        }
        for(char p:sb.reverse().toString().toCharArray()){
            if(!st.isEmpty() && st.peek()=='a' && p=='b'){
                st.pop();
                cnt+=x;
            }
            else st.push(p);
        }
        return cnt;
    }
    public int maximumGain(String s, int x, int y) {
        if(x>y) return removeab(s,x,y);
        return removeba(s,x,y);
    }
}