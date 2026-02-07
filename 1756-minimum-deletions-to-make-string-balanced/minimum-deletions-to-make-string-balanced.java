class Solution {
    public int minimumDeletions(String s) {
        int as=0;
        for(char p:s.toCharArray()) if(p=='a') as++;
        int bs=0;
        int ans=10000000;
        for(char p:s.toCharArray()){
            if(p=='a') as--;
            ans=Math.min(ans,(as+bs));
            if(p=='b') bs++;
        }
        return ans;
    }
}