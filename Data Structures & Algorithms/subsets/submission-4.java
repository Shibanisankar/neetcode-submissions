class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subset(0,new ArrayList<Integer>(), nums, res);
        return res;
    }

    private void subset(int start,List<Integer> sub, int[] nums, List<List<Integer>> res) {
        res.add(new ArrayList<>(sub));
        for(int i = start ; i< nums.length; i++){
            sub.add(nums[i]);
            subset(i + 1,sub,nums,res);
            sub.remove(sub.size() - 1);
        }
    }
}
