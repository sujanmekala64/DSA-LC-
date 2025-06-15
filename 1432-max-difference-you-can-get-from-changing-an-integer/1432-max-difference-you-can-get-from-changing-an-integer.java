class Solution {
    public int maxDiff(int num) {
        String val = String.valueOf(num);
        char maxi='-';
        char mini='-';
        for(int i=0;i<val.length();i++){
            char p=val.charAt(i);
            if(i!=0){
                if(maxi=='-' && p!='9') maxi=p;
                if(mini=='-' && p!='1' && p!='0') mini=p;
            }
            else if(i==0){
                if(p=='9') mini=p;
                else if(p=='1') maxi=p;  
                else{
                    mini=p;
                    maxi=p;
                }
            }
            if(maxi!='-' && mini!='-') break;
        }
        if(val.length()==1) return 8;
        String maxval="";
        String minval="";
        for(char p:val.toCharArray()){
            if(p==maxi && p==mini){
                maxval+='9';
                if(p==val.charAt(0)) minval+='1';
                else minval+='0';
            }
            else if(p==maxi){
                maxval+='9';
                minval+=p;
            }
            else if(p==mini){
                maxval+=p;
                if(p==val.charAt(0)) minval+='1';
                else minval+='0';
            }
            else{
                maxval+=p;
                minval+=p;
            }
        }
        System.out.println(maxval+" "+minval+" "+maxi+" "+mini);
        int max = Integer.parseInt(maxval);
        int min = Integer.parseInt(minval);
        return max-min;
    }
}