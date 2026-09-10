class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            max_sum = Math.max(currSum, max_sum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return max_sum;
    }
}