class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, 0, list, ans);
        return ans;
    }

    static void subset(int[] nums, int index, List<Integer> list, List<List<Integer>> ans){
        if (index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        subset(nums, index + 1, list, ans);

        list.remove(list.size() - 1);

        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
        index++;
    }

        subset(nums, index + 1, list, ans);
    }
}