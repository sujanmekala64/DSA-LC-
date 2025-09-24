class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        HashMap<Long,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        if(numerator==0) return "0";
        if ((numerator < 0) ^ (denominator < 0)) sb.append('-');
        long n=Math.abs((long)numerator);
        long d=Math.abs((long)denominator);
        long g=n/d;
        sb.append(g);
        long num=n%d;
        if(num==0){
            return sb.toString();
        }
        sb.append('.');
        while(num!=0){
            if(map.containsKey(num)){
                int idx=map.get(num);
                sb.insert(idx,'(');
                sb.append(')');
                break;
            }
            map.put(num,sb.length());
            num=num*10;
            sb.append(num/d);
            num=num%d;
        }
        return sb.toString();
    }
}