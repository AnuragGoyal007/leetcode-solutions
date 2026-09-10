class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSum = INT_MIN;
        for(int i=0;i<nums.size();i++){
            int currentSum = 0;
            for(int j=i;j<nums.size();j++){
                currentSum += nums[j];
                maxSum = max(currentSum, maxSum);
            }
        }
    return maxSum;
    }
};