class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> li:knowledge){
            map.put(li.get(0),li.get(1));
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        int open=0;
        for(char p:s.toCharArray()){
            if(p=='(') open=1;
            else if(p==')'){
                if(!map.containsKey(sb.toString())) ans.append("?");
                else ans.append(map.get(sb.toString()));
                sb=new StringBuilder();
                open=0;
            }
            else if(open==1) sb.append(p);
            else ans.append(p);
        }
        return ans.toString();
    }
}