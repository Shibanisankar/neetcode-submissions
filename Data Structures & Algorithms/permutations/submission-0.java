class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        perm(nums,new ArrayList<Integer>(),res,visited);
        return res;
    }

    void perm(int[] nums,List<Integer> cur, List<List<Integer>> res,boolean[] visited) {
        if(cur.size() == nums.length){
            res.add(new ArrayList(cur));
            return;
        }
        for( int i = 0; i < nums.length ; i++) {
            if(!visited[i]) {
                cur.add(nums[i]);
                visited[i] = true;
                perm(nums,cur,res,visited);
                cur.remove(cur.size() - 1);
                visited[i] = false;
            }
            
        }
    }
}
