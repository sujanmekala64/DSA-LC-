class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return ans;
        String arr[] = {".",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        countletters(digits,0,arr,"");
        return ans;
    } 
    public void countletters(String digits,int idx,String arr[],String newstr){
        if(idx==digits.length()){
            ans.add(newstr);
            return ;
        }
        char p = digits.charAt(idx);
        String val = arr[p-'0'];
        for(int i=0;i<val.length();i++){
            char s = val.charAt(i);
            countletters(digits,idx+1,arr,newstr+s);
        }
    }
}