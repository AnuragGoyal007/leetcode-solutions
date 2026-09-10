class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int x:nums){
            totalSum += x;
        }

        int leftSum = 0;
        int rightSum = totalSum;

        for(int i=0;i<nums.length;i++){
            rightSum -= nums[i];

            if(leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}