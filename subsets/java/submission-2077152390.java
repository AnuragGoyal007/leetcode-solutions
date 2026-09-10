class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();

        subset(nums, 0, list, ans);
        return ans;
    }

    static void subset(int[] nums, int index, List<Integer> list, List<List<Integer>> ans){
        if (index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Include current element
        list.add(nums[index]);
        subset(nums, index + 1, list, ans);

        // Backtrack
        list.remove(list.size() - 1);

        // Exclude current element
        subset(nums, index + 1, list, ans);
    }
}