class Solution {
    public String intToRoman(int num) {
        int ans[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String a[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String answ="";
        int i=0;
        while(num>0){
            if(num>=ans[i]){
                num-=ans[i];
                answ+=a[i];
            }
            else i++;
        }
        return answ;
    }
}