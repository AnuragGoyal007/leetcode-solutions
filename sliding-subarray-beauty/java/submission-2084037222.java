class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int freq[] = new int[51];
        int n = nums.length;
        int ans[] = new int[n-k+1];

        int l = 0;

        for(int r=0;r<n;r++){
            if(nums[r]<0){
                freq[-nums[r]]++;
            }

            if(r-l+1==k){
                int count = 0;
                int beauty = 0;

                for(int i=50;i>=0;i--){
                    count+=freq[i];

                    if(count>=x){
                        beauty -= i;
                        break;
                    }
                }
                ans[l] = beauty;

                if(nums[l] < 0){
                    freq[-nums[l]]--;
                }
                l++;
            }
        }

        return ans;
    }
}