class Solution {
public:
    int ans=0;
    int singleNumber(vector<int>& nums) {
        for(int i: nums){
            ans^=i;
        }
        return ans;
    }
};