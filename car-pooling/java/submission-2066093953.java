class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1001];

        for(int[] trip: trips){
            int passenger = trip[0];
            int from = trip[1];
            int to = trip[2];

            nums[from] += passenger;
            nums[to] -= passenger;

        }
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>capacity){
                return false;
            }
        }
        return true;
    }
}