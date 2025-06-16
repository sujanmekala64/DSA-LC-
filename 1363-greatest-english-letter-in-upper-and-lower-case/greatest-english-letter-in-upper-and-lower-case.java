class Solution {
    public String greatestLetter(String s) {
        int arr[] = new int[123];
        for(char p:s.toCharArray())  arr[(int)(p)]++;
        String ans="";
        for(int i=64;i<=90;i++){
            if(arr[i]>0 && arr[i+32]>0) ans=((char)(i))+"";
        }
        return ans;
    }
}