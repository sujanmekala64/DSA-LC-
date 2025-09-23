class Solution {
    public int compareVersion(String version1, String version2) {
        //for this method u can directly use split method to split . without inbuilt function here is the code
        int idx1=0;
        int idx2=0;
        for(int i=0;i<version1.length();i++){ 
            if(version1.charAt(i)=='.') break;
            idx1++;
        }
        for(int i=0;i<version2.length();i++){ 
            if(version2.charAt(i)=='.') break;
            idx2++;
        }
        int n1 = Integer.parseInt(version1.substring(0,idx1));
        int n2 = Integer.parseInt(version2.substring(0,idx2));
        if(n1<n2) return -1;
        else if(n1>n2) return 1;
        while(true){
            if(idx1==version1.length() || idx2==version2.length() || (version1.charAt(idx1)=='.' && version2.charAt(idx2)=='.')){
                String s1="0";
                String s2="0";
                if(idx1<version1.length()) idx1++;
                if(idx2<version2.length()) idx2++;
                while(idx1<version1.length() && (version1.charAt(idx1)!='.' || version1.charAt(idx1)=='0')){
                    s1+=version1.charAt(idx1);
                    idx1++;
                }
                while(idx2<version2.length() && (version2.charAt(idx2)!='.' || version2.charAt(idx2)=='0')){
                    s2+=version2.charAt(idx2);
                    idx2++;
                }
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                if(num1<num2) return -1;
                else if(num1>num2) return 1;
                else if(idx1==version1.length() && idx2==version2.length()) return 0;
            }
        }
    }
}