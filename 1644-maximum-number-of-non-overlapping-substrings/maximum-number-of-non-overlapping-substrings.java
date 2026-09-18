class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int first[]=new int[26];
        int last[]=new int[26];
        for(int i=0;i<26;i++){
            first[i]=-1;
            last[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            int p=s.charAt(i)-'a';
            if(first[p]==-1) first[p]=i;
            last[p]=i;
        }
        List<String> ans=new ArrayList<>();
        List<int[]> pos=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(first[i]==-1) continue;
            int st=first[i];
            int e=last[i];
            boolean check=true;
            for(int j=st;j<=e;j++){
                int val=s.charAt(j)-'a';
                if(first[val]<st){
                    check=false;
                    break;
                }
                e=Math.max(e,last[val]);
            }
            if(check) pos.add(new int[]{st,e});
        }
        Collections.sort(pos,(a,b)->{
            return Integer.compare(a[1],b[1]);
        });
        int endpos=-1;
        for(int val[]:pos){
            int st=val[0];
            int e=val[1];
            if(st>endpos){
                ans.add(s.substring(st,e+1));
            }
            endpos=e;
        }
        return ans;
    }
}