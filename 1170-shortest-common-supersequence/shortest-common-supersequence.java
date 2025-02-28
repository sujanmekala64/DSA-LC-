class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int arr[][] = new int[l1+1][l2+1];
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];
                }
                else arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
            }
        }
        String val="";
        int i=l1;
        int j=l2;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                val+=str1.charAt(i-1);
                i--;
                j--;
            }
            else if(arr[i][j-1]>=arr[i-1][j]){
                val+=str2.charAt(j-1);
                j--;
            }
            else{
                val+=str1.charAt(i-1);
                i--;
            }
        }
        while(i>0){
            val+=str1.charAt(i-1);
            i--;
        }
        while(j>0){
            val+=str2.charAt(j-1);
            j--;
        }
        String str = "";
        for(int f=val.length()-1;f>=0;f--) str+=val.charAt(f);
        return str;
    }
}