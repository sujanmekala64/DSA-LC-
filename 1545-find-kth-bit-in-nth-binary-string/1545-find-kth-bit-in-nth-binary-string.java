class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        n--;
        String s="";
        int f=0;
        while(n>0){
            sb.append("1");
            f=sb.length();
            for(int i=sb.length()-2;i>=0;i--){
                sb.append((char)'1'-sb.charAt(i));
            }
            n--;
        }
        // System.out.println(sb);
        return sb.charAt(k-1);
    }
}