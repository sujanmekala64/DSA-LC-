// import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // BigInteger num1 = new BigInteger(a,2);
        // BigInteger num2 = new BigInteger(b,2);
        // BigInteger sum = num1.add(num2);
        // return sum.toString(2);
        int alen = a.length()-1;
        int blen = b.length()-1;
        int carry=0;
        int sum=0;
        StringBuilder sb = new StringBuilder();
        while(alen>=0 || blen>=0 || carry==1){
            sum=0;
            if(alen>=0) sum+=(a.charAt(alen))-'0';
            if(blen>=0) sum+=(b.charAt(blen))-'0';
            sum+=carry;
            carry=0;
            if(sum<=1) sb.append(sum+"");
            else if(sum==2){
                sb.append("0");
                carry=1;
            }
            else{
                sb.append("1");
                carry=1;
            }
            alen--;
            blen--;
        }
        return sb.reverse().toString();
    }
}