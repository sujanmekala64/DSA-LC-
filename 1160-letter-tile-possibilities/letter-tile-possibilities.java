class Solution {
    public int check(String tiles,int freq[]){
        int ways=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                freq[i]--;
                ways+=1+check(tiles,freq);
                freq[i]++;
            }
        }
        return ways;
    }
    public int numTilePossibilities(String tiles) {
        int freq[] = new int[26];
        for(char p:tiles.toCharArray()){
            freq[p-'A']++;
        }
        return check(tiles,freq);
    }
}