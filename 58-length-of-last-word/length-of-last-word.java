class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String splits[] = s.split("\\s+");
        return splits[splits.length-1].length();
    }
}