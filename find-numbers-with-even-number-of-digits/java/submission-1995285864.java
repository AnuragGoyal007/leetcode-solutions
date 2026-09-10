class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int x: nums){
            int digits = 0;
            while(x>0){
                x/=10;
                digits += 1;
            }

            if(digits%2==0){
                count += 1;
            }
        }

        return count;
    }
}