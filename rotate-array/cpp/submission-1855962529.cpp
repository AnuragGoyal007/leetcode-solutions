class Solution {

private :
    void reverse(vector<int>& nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }


public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k% nums.size();
        reverse(nums, 0, n-1);
        reverse(nums, 0,k-1);
        reverse(nums,k, n-1);
    }

    
};