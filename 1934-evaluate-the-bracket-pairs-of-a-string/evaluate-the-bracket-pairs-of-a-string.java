class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> li:knowledge) map.put(li.get(0),li.get(1));
        StringBuilder ans=new StringBuilder();
        int left=0;
        int n=s.length();
        char p='a';
        int i=0;
        while(i<n){
            p=s.charAt(i);
            if(p=='('){
                left=i+1;
                while(i<n && p!=')'){
                    p=s.charAt(i);
                    i++;
                }
                // System.out.println(s.substring(left,i-1));
                if(!map.containsKey(s.substring(left,i-1))) ans.append("?");
                else ans.append(map.get(s.substring(left,i-1)));
            }
            else{
                ans.append(p);
                i++;
            }
        }
        return ans.toString();
    }
}