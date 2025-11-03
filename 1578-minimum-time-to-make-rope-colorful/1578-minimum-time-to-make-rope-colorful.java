class Pair{
    char c;
    int val;
    Pair(char c,int val){
        this.c=c;
        this.val=val;
    }   
}
class Solution {
    public int minCost(String colors, int[] neededTime) {
        Stack<Pair> st = new Stack<>();
        int ans=0;
        for(int i=0;i<colors.length();i++){
            char p=colors.charAt(i);
            int time=neededTime[i];
            if(!st.isEmpty()){
                Pair pair = st.peek();
                if(pair.c==p){
                    if(pair.val<=time){
                        st.pop();
                        ans+=pair.val;
                        st.push(new Pair(p,time));
                    }
                    else{
                        ans+=time;
                    }
                }
                else{
                    st.push(new Pair(p,time));
                }
            }
            else{
                st.push(new Pair(p,time));
            }
        }
        while(!st.isEmpty()){
            Pair pair = st.pop();
            System.out.println(pair.c+" "+pair.val);
        }
        return ans;
    }
}