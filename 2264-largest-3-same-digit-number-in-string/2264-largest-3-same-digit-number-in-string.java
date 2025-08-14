class Solution {
    public String largestGoodInteger(String num) {
        String f="";
        int n=num.length();
        for(int i=1;i<n-1;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1))
                if(num.substring(i-1,i+2).compareTo(f)>0)
                    f=num.substring(i-1,i+2);
        }
        return f;
    }
}
// int n = num.length(),max=Integer.MIN_VALUE,f=Integer.MIN_VALUE;
//         String h = " ";
//         char p[] = num.toCharArray();
//         int nums[] = new int[n];
//         for(int i=0;i<n;i++){
//             nums[i] = Character.getNumericValue(p[i]);
//         }
//         for(int i=1;i<n-1;i++){
//             if(nums[i-1]==nums[i] && nums[i]==nums[i+1]){
//                 max = nums[i];
//             }
//             if(max>f){
//                 f=max;
//                 h = Integer.toString(nums[i-1])+Integer.toString(nums[i])+Integer.toString(nums[i+1]);
//             }
//         }
//         if(f==Integer.MIN_VALUE)
//             return "";
//         return h;