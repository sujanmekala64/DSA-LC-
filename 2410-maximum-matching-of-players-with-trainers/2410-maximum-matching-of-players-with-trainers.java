class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        int ans=0;
        int idx=trainers.length-1;
        for(int i=players.length-1;i>=0;i--){
            if(players[i]<=trainers[idx]){
                ans++;
                idx--;
            }
            if(idx<0) break;
        }
        return ans;
    }
}