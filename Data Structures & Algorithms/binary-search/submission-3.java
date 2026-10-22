class Solution {
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length - 1, target);
    }
    public int search(int[] nums,int start, int end, int target) {
        if ( start > end){
            return -1;
        }
        int pivot = (end + start)/2;
        if (nums[pivot] == target) {
            return pivot;
        } else if(nums[pivot] < target) {
            return search(nums,pivot + 1,end,target);
        } else {
            return search(nums,start, pivot - 1, target);
        }
    }
}
