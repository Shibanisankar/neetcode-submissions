class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       cal(0, candidates,new ArrayList<Integer>(), 0, target); 
       return res;    
    }

    void cal(int index, int[] nums,List<Integer> cur,int sum, int target){
        if(sum == target) {
            res.add(new ArrayList(cur));
            return;
        }
        if(sum > target ){
            return;
        } 
        
        for (int i = index;i<nums.length ; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            cur.add(nums[i]);
            cal(i + 1,nums,cur,sum + nums[i], target);
            cur.remove(cur.size() - 1);
        }
    }
}

