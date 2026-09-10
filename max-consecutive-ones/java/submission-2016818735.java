class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int maxOnes = 0;

        for(int num: nums){
            if(num==1){
                current++;
                maxOnes = Math.max(maxOnes, current);
            }else{
                current = 0;
            }
        }

        return maxOnes;
    }
}