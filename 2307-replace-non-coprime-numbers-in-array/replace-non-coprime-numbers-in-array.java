class Solution {
    public int findGCD(int a,int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int num:nums){
            int curr=num;
            while(!st.isEmpty()){
                int top = st.peek();
                int gcd = findGCD(curr,top);
                if(gcd==1) break;
                curr=(top/gcd)*curr;
                st.pop();
            }
            st.push(curr);
        }
        return new ArrayList<>(st);
    }
}