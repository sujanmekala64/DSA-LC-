class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        char p[] = {'A','C','G','T'};
        HashSet<String> ques = new HashSet<>();
        for(int i=0;i<bank.length;i++){
            ques.add(bank[i]);
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(startGene);
        int level=0;
        boolean ans=false;
        while(!queue.isEmpty()){
            int n = queue.size();
            while(n!=0){
                String s = queue.poll();
                if(s.equals(endGene)){
                    ans=false;
                    return level;
                }
                for(int i=0;i<s.length();i++){
                    for(int j=0;j<p.length;j++){
                        char ps[] = s.toCharArray();
                        ps[i]=p[j];
                        String newstr = new String(ps);
                        if(ques.contains(newstr)){
                            ques.remove(newstr); // if we didnt do this time will exceed
                            queue.offer(newstr);
                        }
                    }
                }
                n--;
            }
            level++;
        }
        return ans?level:-1;
    }
}