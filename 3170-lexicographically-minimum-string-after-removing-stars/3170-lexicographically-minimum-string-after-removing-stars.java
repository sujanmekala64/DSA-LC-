class Solution {
    public String clearStars(String s) {
        List<List<Integer>> map = new ArrayList<>();
        for(int i=0;i<26;i++){
            map.add(new ArrayList<>());
        }
        char arr[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(p=='*'){
                for(int j=0;j<26;j++){
                        if(map.get(j).size()>0){
                            int idx=map.get(j).remove(map.get(j).size()-1);
                            arr[idx]='*';
                            break;
                        }
                }
            }
            else map.get(p-'a').add(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++) if(arr[i]!='*') sb.append(arr[i]);
        return sb.toString();
    }
}