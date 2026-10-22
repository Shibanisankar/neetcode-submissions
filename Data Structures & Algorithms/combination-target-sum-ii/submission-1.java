class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, 0, res, new ArrayList<Integer>(), target);
        return res;
    }

    void dfs(int[] nums, int i, int total, List<List<Integer>> res, List<Integer> curr, int target){
        if(target == total){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i >= nums.length || total > target) {
            return;
        }
        curr.add(nums[i]);
        dfs(nums, i + 1, total + nums[i], res, curr, target);
        curr.remove(curr.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        dfs(nums, i + 1, total, res, curr, target);
    }
}

