class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> li = new ArrayList<>();
        int n=digits.length;
        int c=n-1;
        if(digits[n-1]!=9) digits[n-1]+=1;
        else{
            while(c>=0){
                if(digits[c]==9) digits[c]=0;
                c--;
                if(c<0){
                    li.add(1);
                    break;
                }
                else if(digits[c]!=9){
                    digits[c]+=1;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            li.add(digits[i]);
        }
        int arr[] = new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}