class Solution {
    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' ||
            p=='u' || p=='A' || p=='E' || p=='I' ||
            p=='O' || p=='U') return true;
        return false;
    }
    public String sortVowels(String s) {
        List<Character> li = new ArrayList<>();
        for(char p:s.toCharArray()){
            if(isVowel(p)) li.add(p);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(li);
        // System.out.println(li);
        int idx=0;
        for(char p:s.toCharArray()){
            if(isVowel(p)){
                sb.append(li.get(idx));
                idx++;
            }
            else sb.append(p);
        }
        return sb.toString();
    }
}