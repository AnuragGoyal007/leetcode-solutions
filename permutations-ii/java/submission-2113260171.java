class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recPermute(0,nums,ans);
        return ans;
    }

    private void recPermute(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int num: nums){
                ds.add(num);
            }
            ans.add(ds);
            return;
        }
        Set<Integer> used = new HashSet<>();
        for(int i=index;i<nums.length;i++){
            if(used.contains(nums[i])){
                continue;
            }

            used.add(nums[i]);
            swap(i,index,nums);
            recPermute(index+1,nums,ans);
            swap(i,index,nums); // backtracking time (reswap)
        }
    }

    private void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}