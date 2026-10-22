class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int[] res = new int[nums.length];
        int zcount = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0)
                mul *= nums[i];
            else 
                zcount++;
        }
        if(zcount > 1)
            return res;

        for(int i = 0 ; i < nums.length ; i++) {
            if(zcount > 0)
                res[i] = nums[i] == 0 ? mul : 0;
            else
                res[i] = mul / nums[i];
        }

        return res;
    }
}  
