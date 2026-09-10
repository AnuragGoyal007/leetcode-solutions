class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        // All combinations of one land and one water ride
        for(int i=0;i<n;i++){
            int a = landStartTime[i]; // start time for land ride
            int d = landDuration[i]; // duration of the land ride

            for(int j=0;j<m;j++){
                int b = waterStartTime[j]; // start time for water ride
                int e = waterDuration[j]; // duration of the water ride

                // 1. Land --> Water
                int landEnd = a+d;
                int startWater = Math.max(landEnd,b); // wait if needed
                int finish1 = startWater + e;

                // 2. Water --> Land
                int waterEnd = b+e;
                int startLand = Math.max(waterEnd,a); // wait if needed
                int finish2 = startLand + d;

                ans = Math.min(ans, Math.min(finish1, finish2));
            }
        }

        return ans;
    }
}