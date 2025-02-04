class Solution { //right max- left max - 1
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]<=height[i]){
                int rm = i;
                int h = height[st.pop()];
                if(st.isEmpty()) break;
                int lm=st.peek();
                int width = rm-lm-1;
                ans+=(Math.min(height[lm],height[rm])-h)*width;
            }
            st.push(i);
        }
        return ans;
    }
}