class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum=0;
        long arr[] = new long[shifts.length];
        for(int i=shifts.length-1;i>=0;i--){
            sum+=shifts[i];
            arr[i]=sum;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            long val=s.charAt(i)-'a';
            val+=arr[i];
            val=val%26;
            char p = (char)(val+'a');
            sb.append(p);
        }
        return sb.toString();
    }
}