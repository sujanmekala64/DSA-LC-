class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        List<Integer> tr = new ArrayList<>();
        for(int num:trainers) tr.add(num);
        Collections.sort(tr);
        Arrays.sort(players);
        int ans=0;
        for(int i=players.length-1;i>=0;i--){
            if(players[i]<=tr.get(tr.size()-1)){
                ans++;
                tr.remove(tr.size()-1);
            }
            if(tr.size()==0) break;
        }
        return ans;
    }
}