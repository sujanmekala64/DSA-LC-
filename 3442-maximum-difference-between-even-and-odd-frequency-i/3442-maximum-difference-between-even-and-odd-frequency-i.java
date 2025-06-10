class Solution {
    public int maxDifference(String s) {
        int mineven=Integer.MAX_VALUE;
        int maxodd=0;
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            arr[p-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2==0 && arr[i]!=0 && arr[i]<mineven) mineven=arr[i];
            else if(arr[i]%2==1 && arr[i]>maxodd) maxodd=arr[i];
        }
        return (maxodd-mineven);
    }
}