class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> sCount = new HashMap<>();
        Map<Character,Integer> tCount = new HashMap<>();

        for(Character ch : s.toCharArray()){
            sCount.put(ch, sCount.getOrDefault(ch,0) + 1);
        } 

        for(Character ch : t.toCharArray()){
            tCount.put(ch, tCount.getOrDefault(ch,0) + 1);
        }

        return sCount.equals(tCount);
    }
}
