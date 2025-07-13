class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        int ans=0;
        int idx=trainers.length-1;
        int i=players.length-1;
        while(i>=0 && idx>=0){
            if(players[i]<=trainers[idx]){
                ans++;
                idx--;
                System.out.println(players[i]);
            }
            System.out.println(i+" "+idx);
            i--;
        }
        return ans;
    }
}