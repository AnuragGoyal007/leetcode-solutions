class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // original array converting to prefix array
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }

        // Checking for all subarrays jo possible h
        for(int i=0;i<nums.length;i++){
            if(i>= 1 && nums[i]%k==0)
                return true;
            for(int j=0;j<=i-2;j++){
                if((nums[i] - nums[j])% k == 0){
                    return true;
                }
            }
        }
        return false;
    }
}