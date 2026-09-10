class Solution {
    public int thirdMax(int[] nums) {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;

        for(int num: nums){

            if(num == first || num == second || num == third)
                continue;

            if(num > first){
                third = second;
                second = first;
                first = num;
            } else if(num > second){
                third = second;
                second = num;
            } else if(num > third){
                third = num;
            }
        }

        if(third == Integer.MIN_VALUE)
            return first;
        
        return third;
    }
}