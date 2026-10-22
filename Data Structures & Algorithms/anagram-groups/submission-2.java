class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for ( String str : strs ){
            int[] arr = new int[26];
            for ( char ch : str.toCharArray() ) {
                arr[ch - 'a'] = arr[ch - 'a'] + 1;
            }
            String key = Arrays.toString(arr);
            List<String> value = map.containsKey(key) ? map.get(key) : new ArrayList<String>();
            value.add(str);
            map.put(key, value);    
        }
        return map.values().stream().toList();
    }
}
