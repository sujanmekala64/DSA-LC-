class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[128];
        for(int i=0;i<s.length();i++){
            int p=s.charAt(i);
            arr[p]++;
        }
        int c=0;
        for(int i=0;i<128;i++){
            c+=arr[i]/2*2;
            if(c%2==0 && arr[i]%2==1){ //that means that result has only even letters and we can accomodate another character to make it maximum length if arr[i]%2==1
                c+=1;
            }
        }
        return c;
    }
}