class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> m;
        for(int i=0;i<n;i++){
            m[nums[i]]++;
        }
        int majority_element = 0;
        for(auto& p: m){
            if(p.second > n/2){
                majority_element = p.first;
            }
        }
        return majority_element;
    }
};