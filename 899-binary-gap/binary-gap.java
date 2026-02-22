class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int ans=0;
        int prev=-1;
        char p='a';
        for(int i=0;i<s.length();i++){
            p=s.charAt(i);
            if(p=='1'){
                if(prev==-1){
                    prev=i;
                }
                else{
                    ans=Math.max(ans,(i-prev));
                    prev=i;
                }
            }
        }
        return ans;
    }
}