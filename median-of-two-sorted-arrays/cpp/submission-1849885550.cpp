class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
       int m = nums1.size();
       int n = nums2.size();
       int total = m+n;

       vector<int> result;
       result.reserve(total);

       int i = 0;
       int j = 0;

       while(i<m && j<n){
        if(nums1[i] < nums2[j]){
            result.push_back(nums1[i++]);
        }else{
            result.push_back(nums2[j++]);
        }
       }
       while(i<m) result.push_back(nums1[i++]);
       while(j<n) result.push_back(nums2[j++]);

       if(total%2==1){
        return result[total/2];
       }else{
        int mid = total / 2;
        return (result[mid-1] + result[mid]) / 2.00;
       }
    }
};