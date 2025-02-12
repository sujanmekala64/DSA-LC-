class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String splits1[] = s1.split(" ");
        String splits2[] = s2.split(" ");
        for(int i=0;i<splits1.length;i++){
            if(!map.containsKey(splits1[i])) map.put(splits1[i],1);
            else map.put(splits1[i],map.get(splits1[i])+1);
        }
        for(int i=0;i<splits2.length;i++){
            if(!map.containsKey(splits2[i])) map.put(splits2[i],1);
            else map.put(splits2[i],map.get(splits2[i])+1);
        }
        String ans="";
        boolean check=false;
        for(String keys:map.keySet()){
            if(map.get(keys)==1){
                ans+=keys;
                ans+=" ";
                check=true;
            }
        }
        String ret[]=new String[0];
        return check?ans.split(" "):ret;
    }
}