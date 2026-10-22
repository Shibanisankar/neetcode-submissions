class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();
        if(sr.length != tr.length){
            return false;
        }
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for(int i=0; i < sr.length; i++){
            sMap.put(sr[i], sMap.get(sr[i]) == null ? 1 : sMap.get(sr[i]) + 1);
            tMap.put(tr[i], tMap.get(tr[i]) == null ? 1 : tMap.get(tr[i]) + 1);
        }
        for(Character ch : sMap.keySet()){
            if(!sMap.get(ch).equals(tMap.get(ch))){
                return false;
            }
        }
        return true;
    }
}
