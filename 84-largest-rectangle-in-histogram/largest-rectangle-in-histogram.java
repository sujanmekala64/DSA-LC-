class Solution { //index of smallright-index of smallleft-1 * value 
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxarea=0;
        st.push(-1);
        for(int i=0;i<=heights.length;i++){
            int val= i==heights.length?0:heights[i];
            while(st.peek()!=-1 && heights[st.peek()]>val){
                System.out.print(i+" ");
                int rm = i;
                int h = heights[st.pop()];
                int lm = st.peek();
                if(maxarea<h*(rm-lm-1)) maxarea=(rm-lm-1)*h;
            }
            st.push(i);
        }
        return maxarea;
    }
}