class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(),nums.end()); // Array ko sort karenge
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i+1]==nums[i]){
                return true;
            }
        }
        return false;
    }
};