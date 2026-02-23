class Solution {
    public String maximumXor(String s, String t) {
        int zerosoft=0;
        int onesoft=0;
        for(char p:t.toCharArray()){
            if(p=='0') zerosoft++;
            else onesoft++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(t.charAt(i)=='1'){
                    if(onesoft>0){
                        onesoft--;
                        sb.append('1');
                    }
                    else{
                        zerosoft--;
                        sb.append('0');
                    }
                }
                else{
                    if(zerosoft>0){
                        zerosoft--;
                        sb.append('1');
                    }
                    else{
                        onesoft--;
                        sb.append('0');
                    }
                }
            }
            else if(t.charAt(i)=='1'){
                if(zerosoft>0){
                    sb.append('1');
                    zerosoft--;
                }
                else{
                    sb.append('0');
                    onesoft--;
                }
            }
            else{
                if(onesoft>0){
                    sb.append('1');
                    onesoft--;
                }
                else{
                    sb.append('0');
                    zerosoft--;
                }
            }
        }
        return sb.toString();
    }
}