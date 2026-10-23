class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                l = Math.max(l , map.get(ch) + 1);
            }
            map.put(ch, i);
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}
