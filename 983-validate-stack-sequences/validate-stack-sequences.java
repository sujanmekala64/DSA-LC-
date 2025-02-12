class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int j=0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<n;i++){
            s.push(pushed[i]);
            while(!s.isEmpty() && s.peek()==popped[j]){
                j++;
                s.pop();
            }
        }
        if(s.isEmpty()) return true;
        return false;
    }
}