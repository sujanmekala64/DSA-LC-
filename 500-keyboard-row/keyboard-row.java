class Solution {
    public String[] findWords(String[] words) {
        List<String> li = new ArrayList<>();
        for(String word:words){
            int l1=0,l2=0,l3=0;
            for(int i=0;i<word.length();i++){
                char p = Character.toLowerCase(word.charAt(i));
                if("qwertyuiop".contains(p+"")) l1++;
                else if("asdfghjkl".contains(p+"")) l2++;
                else if("zxcvbnm".contains(p+"")) l3++;
            }
            int len=word.length();
            if(l1==len || l2==len || l3==len) li.add(word);
        }
        int n=li.size();
        String arr[]=new String[n];
        for(int i=0;i<n;i++) arr[i]=li.get(i);
        return arr;
    }
}