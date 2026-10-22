class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(Integer i : nums){
            count.put(i , count.containsKey(i) ? count.get(i) + 1 : 1);
        }

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        List<Integer> res = new ArrayList<>();
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k ; i--){
            if(!freq[i].isEmpty()){
                res.addAll(freq[i]);
                index = index + freq[i].size();
            }
            if(index == k) {
                break;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
