class Solution {

    private int n, q;

    private boolean isValid(int[] nums, int[][] que, int k) {
        int[] dist = new int[n];

        for (int i = 0; i <= k; i++) {
            int l = que[i][0], r = que[i][1], val = que[i][2];
            dist[l] += val;
            if (r + 1 < n)
                dist[r + 1] -= val;
        }

        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += dist[i];
            dist[i] += cumSum;
            if (nums[i] - cumSum > 0)
                return false;
        }
        return true;
    }

    public int minZeroArray(int[] nums, int[][] que) {
        n = nums.length;
        q = que.length;

        if (Arrays.stream(nums).allMatch(x -> x == 0)) {
            return 0; // No query required as all elements are already zero
        }

        int l = 0, h = q - 1, ans = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (isValid(nums, que, mid)) {
                ans = mid + 1;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}