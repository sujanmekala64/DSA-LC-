class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for(char p:word.toCharArray()){
            freq[p-'a']=freq[p-'a']+1;
        }
        Integer temp[] = new Integer[26];
        for(int i=0;i<26;i++){
            temp[i]=freq[i];
        }
        Arrays.sort(temp,Collections.reverseOrder());
        int ans=0;
        int val=8;
        for(int i=0;i<26;i++){
            if(temp[i]==0) break;
            ans+=(val/8)*temp[i];
            val++;
        }
        return ans;
    }
}