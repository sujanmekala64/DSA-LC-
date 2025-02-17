class Solution {
    public int minTimeToType(String word) {
        char prevchar='a';
        int ans=0;
        for(int i=0;i<word.length();i++){
            char newchar = word.charAt(i);
            int diff = Math.abs(newchar-prevchar);
            ans+=1;
            ans+=Math.min(diff,26-diff);
            prevchar=newchar;
            System.out.println(i+" "+ans);
        }
        return ans;
    }
}