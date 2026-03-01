class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int g=-1;
        int p=-1;
        int m=-1;
        int totp=0;
        int totm=0;
        int totg=0;
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("G")) g=i;
            if(garbage[i].contains("P")) p=i;
            if(garbage[i].contains("M")) m=i;
            for(char y:garbage[i].toCharArray()){
                if(y=='g') totg++;
                else if(y=='p') totp++;
                else totm++;
            }
        }
        System.out.println(g+" "+p+" "+m);
        int ans=0;
        for(int i=0;i<travel.length;i++){
            if(g!=-1 && i<g) ans+=travel[i];
            if(p!=-1 && i<p) ans+=travel[i];
            if(m!=-1 && i<m) ans+=travel[i];
            // System.out.println(ans);
        }
        return ans+totp+totg+totm;
    }
}