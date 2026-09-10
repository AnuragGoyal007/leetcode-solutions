class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==0)
                nums[i] = -1;
        }

        for(int i=1;i<n;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        int max = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int l = i+1;
                if(max<l) max = l;
            }

            for(int j=0;j<i;j++){
                if(nums[i] - nums[j] == 0){
                    int l = i - j;
                    if(max < l)
                        max = l;
                }
            }
        }
        return max;
    }
}