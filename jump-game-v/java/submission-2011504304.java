class Solution {

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;

        // dp[i] = maximum positions we can visit starting from i
        int[] dp = new int[n];

        int ans = 1;

        // Try starting from every index
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(i, arr, d, dp));
        }

        return ans;
    }

    private int dfs(int i, int[] arr, int d, int[] dp) {

        // If already calculated
        if (dp[i] != 0) {
            return dp[i];
        }

        int max = 1; // count current index itself

        // ---------- RIGHT ----------
        for (int j = i + 1; j <= Math.min(i + d, arr.length - 1); j++) {

            // Cannot jump further
            if (arr[j] >= arr[i]) {
                break;
            }

            max = Math.max(max, 1 + dfs(j, arr, d, dp));
        }

        // ---------- LEFT ----------
        for (int j = i - 1; j >= Math.max(i - d, 0); j--) {

            // Cannot jump further
            if (arr[j] >= arr[i]) {
                break;
            }

            max = Math.max(max, 1 + dfs(j, arr, d, dp));
        }

        // Store answer
        dp[i] = max;

        return dp[i];
    }
}