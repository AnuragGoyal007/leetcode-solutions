class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        permute(nums, 0, nums.length, ans);

        return ans;
    }

    static void permute(int[] nums, int start, int end, List<List<Integer>> ans){
        if(start==end){
            List<Integer> list = new ArrayList<>();

            for(int num: nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for(int i=start;i<end;i++){
            swap(nums, start, i);
            permute(nums, start+1, end, ans);
            swap(nums, start, i);
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}