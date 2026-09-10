class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;

        for(int i=1;i<n;i++){
            nums[i] = nums[i-1] + nums[i];
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>=k){
                int l = i+1;
                if(min>l) min = l;
            }
            for(int j=0;j<i;j++){
                if(nums[i] - nums[j] >= k){
                    int len = i-j;
                    if(len<min) min = len;
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
       return min;
    }
}