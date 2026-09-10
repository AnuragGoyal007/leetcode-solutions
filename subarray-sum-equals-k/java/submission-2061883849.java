class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0) return 0;

        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                for(int x=i;x<=j;x++){
                sum += nums[x];
                }

                if(sum==k)
                    count++;
            }
        }

        return count;
    }
}