class Solution {
    public boolean isGood(int[] nums) {

        int n = nums.length - 1;
        if(n==0){
            return false;
        }

        int[] count = new int[n+1];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<1 || nums[i]>n){
                return false;
            }
            count[nums[i]]++;
        }

        for(int i=1;i<n;i++){
            if(count[i] != 1){
                return false;
            }
        }

        if(count[n] != 2){
        return false;
        }   
        return true;
    }
}