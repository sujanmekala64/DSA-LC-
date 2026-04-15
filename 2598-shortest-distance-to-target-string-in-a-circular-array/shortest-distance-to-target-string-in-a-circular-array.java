class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int left=startIndex;
        int right=startIndex;
        int n=words.length;
        int steps=0;
        while(steps<n){
            left = ((left%n)+n)%n;
            right = ((right%n)+n)%n;
            if(words[left].equals(target)) return steps;
            else if(words[right].equals(target)) return steps;
            steps++;
            left--;
            right++;
        }
        return -1;
    }
}