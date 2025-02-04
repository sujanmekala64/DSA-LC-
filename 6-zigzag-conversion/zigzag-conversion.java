class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()) return s;
        List<Character>[] rows = new ArrayList[numRows];
        for(int i=0;i<numRows;i++) rows[i]=new ArrayList<>();
        int idx=0;
        int d=0;
        for(char p:s.toCharArray()){
            rows[idx].add(p);
            if(idx==0){
                d=1;
            }
            else if(idx==numRows-1){
                d=-1;
            }
            idx+=d;
        }
        StringBuilder sb = new StringBuilder();
        for(List<Character> row:rows){
            for(char c:row){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}