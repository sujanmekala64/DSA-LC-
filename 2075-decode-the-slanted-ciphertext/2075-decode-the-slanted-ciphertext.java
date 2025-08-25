class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols = encodedText.length()/rows;
        TreeMap<Integer,List<Character>> map = new TreeMap<>();
        char mat[][] = new char[rows][cols];
        int r=0;
        int c=0;
        for(int i=0;i<encodedText.length();i++){
            if(c==cols){
                r++;
                c=0;
            }
            mat[r][c]=encodedText.charAt(i);
            c++;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int val = (j-i);
                if(!map.containsKey(val)) map.put(val,new ArrayList<>());
                map.get(val).add(mat[i][j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key:map.keySet()){
            if(key<0) continue;
            List<Character> li = map.get(key);
            for(int i=0;i<li.size();i++) sb.append(li.get(i));
        }
        return sb.toString().stripTrailing();
    }
}