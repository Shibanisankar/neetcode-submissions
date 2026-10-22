class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> count = new HashMap<>();
       List<Integer>[] list = new ArrayList[nums.length + 1];
    
        for(int i = 0; i < list.length ;i++){
            list[i]= new ArrayList<>();
        }
       for (int i: nums)
            count.put(i, count.getOrDefault(i,0) + 1);
       for (Map.Entry<Integer, Integer> entry : count.entrySet())
            list[entry.getValue()].add(entry.getKey());
       
       int[] res = new int[k];
       int index = 0;
       for(int j = list.length - 1 ; j >= 0 && index < k ; j--) {
            for (int num: list[j]){
                res[index++] = num;
                if(index == k)
                    return res;
            }
       }
       return res;

    }
}
