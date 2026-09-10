import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int ans = 0;
        int count = 0;

        // Traverse from largest to smallest
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;

            if (count % 3 != 0) { // Every 3rd candy is free
                ans += cost[i];
            }
        }

        return ans;
    }
}