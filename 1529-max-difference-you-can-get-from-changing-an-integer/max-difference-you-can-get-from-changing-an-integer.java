class Solution {
    public int maxDiff(int num) {
        String val = String.valueOf(num);
        char maxi='-';
        char mini='-';
        if(val.length()==1) return 8;
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
        int max=0;
        int min=0;
        int rem=0;
        int ans=0;
        for(int i=0;i<val.length();i++){
            char p = val.charAt(i);
            int v = (p-'0');
            if(p==maxi && p==mini){
                max=9;
                if(p==val.charAt(0)) min=1;
                else min=0;
            } 
            else if(p==maxi){
                max=9;
                min=v;
            }
            else if(p==mini){
                max=v;
                if(p==val.charAt(0)) min=1;
                else min=0;
            }
            else{
                max=v;
                min=v;
            }
            int vals = rem+max-min;
            ans=ans*10+vals;
            if(max<min) rem=-1;
            else rem=0;
        }
        return ans;
        // String maxval="";
        // String minval="";
        // for(char p:val.toCharArray()){
        //     if(p==maxi && p==mini){
        //         maxval+='9';
        //         if(p==val.charAt(0)) minval+='1';
        //         else minval+='0';
        //     }
        //     else if(p==maxi){
        //         maxval+='9';
        //         minval+=p;
        //     }
        //     else if(p==mini){
        //         maxval+=p;
        //         if(p==val.charAt(0)) minval+='1';
        //         else minval+='0';
        //     }
        //     else{
        //         maxval+=p;
        //         minval+=p;
        //     }
        // }
        // int max = Integer.parseInt(maxval);
        // int min = Integer.parseInt(minval);
        // return max-min;
    }
}