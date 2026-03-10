class Solution {
    // class Node{
    //     Node[] children;
    //     boolean eow;
    //     public Node(){
    //         children=new Node[26];
    //         for(int i=0;i<26;i++) children[i]=null;
    //         eow=false;
    //     }
    // }
    // public Node root = new Node();
    // public void insert(String word){
    //     Node curr=root;
    //     for(int i=1;i<word.length();i++){
    //         int idx = word.charAt(i)-'a';
    //         if(curr.children[idx]==null) curr.children[idx]=new Node();
    //         if(i==word.length()-1) curr.children[idx].eow=true;
    //         curr=curr.children[idx];
    //         while(word.charAt(i)=='/') i++;
    //     }
    // }
    // public void findWords(Node root, String s){
    //     if(root.eow){
    //         ans.add(s);
    //         return ;
    //     }
    //     for(int i=0;i<26;i++){
    //         if(root.children[i]!=null){
    //             findWords(root.children[i],s+'/'+(char)(i+'a'));
    //         }
    //     }
    // }
    // List<String> ans = new ArrayList<>();
    public List<String> removeSubfolders(String[] folder) {
        // for(String word:folder){
        //     insert(word);
        // }
        // findWords(root,"");
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        String s=folder[0]+'/';
        for(int i=1;i<folder.length;i++){
            if(!folder[i].startsWith(s)){
                s=folder[i]+'/';
                // System.out.println(s);
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}