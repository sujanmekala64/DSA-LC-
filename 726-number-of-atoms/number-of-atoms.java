class Solution {
    public String countOfAtoms(String formula) {
        Stack<HashMap<String,Integer>> st = new Stack<>();
        int i=0;
        int n=formula.length();
        st.push(new HashMap<String,Integer>());
        while(i<n){
            char p=formula.charAt(i);
            if(p=='('){
                st.push(new HashMap<String,Integer>());
                i++;
            }
            else if(p==')'){
                HashMap<String,Integer> top = st.pop();
                i++;
                String mult="";
                boolean vala=false;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    mult+=formula.charAt(i);
                    i++;
                    vala=true;
                }
                int multival;
                if(vala){
                    multival = Integer.parseInt(mult);
                    for(String keys:top.keySet()){
                        top.put(keys,top.get(keys)*multival);
                    }
                }
                else  multival=1;
                HashMap<String,Integer> topnow = st.peek();
                for(String keys:top.keySet()){
                    if(!topnow.containsKey(keys)) topnow.put(keys,top.get(keys));
                    else topnow.put(keys,topnow.get(keys)+top.get(keys));
                }
            }
            else{
                String currele=formula.charAt(i)+"";
                i++;
                while(i<n && Character.isLetter(formula.charAt(i)) && Character.isLowerCase(formula.charAt(i))){
                    currele+=formula.charAt(i);
                    i++;
                }
                String currcount ="";
                boolean valp=false;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    currcount+=formula.charAt(i);
                    i++;
                    valp=true;
                }
                int cnt=1;
                if(valp){
                    cnt = Integer.parseInt(currcount);
                }
                HashMap<String,Integer> topsi = st.peek();
                if(!topsi.containsKey(currele)) topsi.put(currele,cnt);
                else topsi.put(currele,topsi.get(currele)+cnt);
            }
        }
        HashMap<String,Integer> maps = st.peek();
        TreeMap<String,Integer> sortedmap = new TreeMap<>();
        for(String keysi:maps.keySet()){
            sortedmap.put(keysi,maps.get(keysi));
        }
        String res="";
        for(String keys:sortedmap.keySet()){
            res+=keys;
            if(sortedmap.get(keys)!=1) res+=sortedmap.get(keys);
        }
        return res;
    }
}