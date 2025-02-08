class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> ques = new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            ques.add(wordList.get(i));
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level=0;
        boolean ans=false;
        while(!queue.isEmpty()){
            int n = queue.size();
            while(n!=0){
                String s = queue.poll();
                if(s.equals(endWord)){
                    ans=true;
                    return level+1;
                }
                for(int i=0;i<s.length();i++){
                    for(int j=0;j<26;j++){
                        char p[] = s.toCharArray();
                        p[i]=(char)(j+'a');
                        String newstr = new String(p);
                        if(ques.contains(newstr)){
                            ques.remove(newstr);
                            queue.offer(newstr);
                        }
                    }
                }
                n--;
            }
            level++;
        }
        return ans?level:0;
    }
}