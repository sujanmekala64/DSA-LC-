class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans=0;
        int n=skill.length;
        long val=skill[0]+skill[n-1];
        int m=skill[0]*skill[n-1];
        ans+=m;
        for(int i=1;i<skill.length-1/2;i++){
            long add = skill[i]+skill[n-i-1];
            if(add!=val) return -1;
            long mul=skill[i]*skill[n-i-1];
            ans+=mul;
        }
        return ans/2;
    }
}