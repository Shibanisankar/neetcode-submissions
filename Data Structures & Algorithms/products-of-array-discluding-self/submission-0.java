class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pr = new int[nums.length];
        int[] sr = new int[nums.length];
        int[] res = new int[nums.length];
        int mul = 1;
        for(int i=0 ; i < nums.length ; i++) {
            pr[i] = mul;
            mul = mul * nums[i];
        }
        mul = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--) {
            sr[i] = mul;
            mul = mul * nums[i];
        }
        for(int i = 0 ; i<nums.length ; i++) {
            res[i] = pr[i] * sr[i];
        }
        return res;
    }
}  
