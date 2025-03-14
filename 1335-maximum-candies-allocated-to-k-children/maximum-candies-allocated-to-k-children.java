class Solution {
    private boolean canDistribute(int[] candies, int mid, long k) {
        long count = 0;
        for (int c : candies) {
            count += c / mid;
        }
        return count >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        int l = 1, h = Arrays.stream(candies).max().getAsInt();
        int ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (canDistribute(candies, mid, k)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}