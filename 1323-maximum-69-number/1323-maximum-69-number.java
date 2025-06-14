class Solution {
    public int maximum69Number (int num) {
       StringBuilder sb = new StringBuilder();
       String val = String.valueOf(num);
       String newstr="";
       boolean check=false;
       for(char p:val.toCharArray()){
        if(p=='6' && !check){
            check=true;
            sb.append('9');
        }
        else sb.append(p);
       } 
       return Integer.parseInt(sb.toString());
    }
}