class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int currSum = 0;
        int start = 0;
        int minlen = INT_MAX;
        for(int end=0;end<nums.size();end++){
            currSum+= nums[end];
            while(currSum>=target){
                minlen = min(minlen, end-start+1);
                currSum -= nums[start];
                start++;
            }
        }
        if(minlen == INT_MAX){
            return 0;
        } else {
            return minlen;
        }
    }
};