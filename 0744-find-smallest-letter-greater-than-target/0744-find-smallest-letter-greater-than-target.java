class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int mini=Integer.MAX_VALUE;
        int f=target-'a';
        char h='a';
        for(char s:letters){
            int g = s-'a';
            if(g<f && mini>26-f+g){
                mini=26-f+g;
                h=s;
            }
            else if(g>f && mini>(g-f)){
                mini=g-f;
                h=s;
            }
        }
        return h;
    }
}