class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp[] = score.clone();
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            map.put(temp[i],temp.length-i); //rank starts from n to 1
        }
        String res[] = new String[temp.length];
        for(int i=0;i<temp.length;i++){
            int rank = map.get(score[i]);
            String rankstr = rank+"";
            if(rank==1) res[i]="Gold Medal";
            else if(rank==2) res[i]="Silver Medal";
            else if(rank==3) res[i] = "Bronze Medal";
            else res[i]=rankstr;
        }
        return res;
    }
}