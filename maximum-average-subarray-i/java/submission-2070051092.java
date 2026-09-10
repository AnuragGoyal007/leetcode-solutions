class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum = 0;

        // first window
        for(int i=0;i<k;i++){
            window_sum += nums[i];
        }
        double avg = (double) window_sum/k;

        // Slide
        for(int i=k;i<nums.length;i++){
            window_sum += nums[i];
            window_sum -= nums[i-k];
            double currAvg = (double) window_sum/k;
            avg = Math.max(avg, currAvg);
        }
        return avg;
    }
}