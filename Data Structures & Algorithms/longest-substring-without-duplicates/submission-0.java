class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        while(r < arr.length) {
            if(map.containsKey(arr[r])) {
                l = Math.max(l, map.get(arr[r]) + 1);
            }
            map.put(arr[r], r);
            r++;
            res = Math.max(res, r - l );
        }
        return res;
    }
}
