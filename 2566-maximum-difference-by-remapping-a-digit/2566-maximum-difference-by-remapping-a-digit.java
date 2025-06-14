class Solution {
    public int minMaxDifference(int num) {
        char minchange='-';
        char maxchange='-';
        String s=String.valueOf(num);
        for(char p:s.toCharArray()){
            if(p!='9' && p!='0'){
                if(minchange!='9') minchange=p;
                if(maxchange!='0') maxchange=p;
                break;
            }
            else if(p=='9'){
                minchange='9';
            }
            else if(p=='0'){
                maxchange='0';
            }
        } //mincha=9 maxch=0
        String maxans="";
        String minans="";
        for(char p:s.toCharArray()){
            if(p==maxchange && p==minchange){
                maxans+='9';
                minans+='0';
            }
            else if(p==minchange){
                maxans+=p;
                minans+='0';
            }
            else if(p==maxchange){
                minans+=p;
                maxans+='9';
            }
            else{
                maxans+=p;
                minans+=p;
            }
        }
        System.out.println(maxans+" "+minans);
        int max = Integer.parseInt(maxans);
        int min = Integer.parseInt(minans);
        return max-min;
    }
}