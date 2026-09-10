class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_map<int,int> m;

        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        int duplicate_num;
        for(auto&p:m){
            if(p.second>1){
                duplicate_num = p.first;
            }
        }
        return duplicate_num;
    }
};