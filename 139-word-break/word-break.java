class Solution {
    public static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++) children[i]=null;
            eow=false;
        }
    }
    public Node root = new Node();
    HashMap<String,Boolean> map = new HashMap<>();
    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null) curr.children[idx]=new Node();
            if(i==word.length()-1) curr.children[idx].eow=true;
            curr=curr.children[idx];
        }
    }
    // public void printTrie(Node root, String word){
    //     if(root.eow) System.out.println(word);
    //     for(int i=0;i<26;i++){
    //         if(root.children[i]!=null){
    //             printTrie(root.children[i],word+(char)(i+'a'));
    //         }
    //     }
    // }
    public boolean search(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]==null) return false;
            if(s.length()-1==i && curr.children[idx].eow==false) return false;
            curr=curr.children[idx];
        }
        return true;
    }
    public boolean checkCondition(String s){
        if(s.length()==0) return true;
        if(map.containsKey(s)) return map.get(s);
        for(int i=1;i<=s.length();i++){
            String first = s.substring(0,i);
            String second = s.substring(i);
            if(search(first) && checkCondition(second)){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(int i=0;i<wordDict.size();i++){
            insert(wordDict.get(i));
        }
        // printTrie(root,"");/
        return checkCondition(s);
    }
}