class Solution {
    public boolean isvowel(char f){
        if(f=='a' || f=='e' || f=='i' || f=='o' || f=='u' || f=='A' || f=='E' || f=='I' || f=='O' || f=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char p[] = s.toCharArray();
        while(start<end){
            if(isvowel(p[start]) && isvowel(p[end])){
                char temp=p[start];
                p[start]=p[end];
                p[end]=temp;
                start++;
                end--;
            }
            else if(isvowel(p[start])) end--;
            else if(isvowel(p[end])) start++;
            else{
                start++;
                end--;
            }
        }
        String ans = String.valueOf(p);
        return ans;
    }
}