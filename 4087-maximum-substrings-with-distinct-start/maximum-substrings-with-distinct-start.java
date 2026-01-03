class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char p:s.toCharArray()) set.add(p);
        return set.size();
    }
}