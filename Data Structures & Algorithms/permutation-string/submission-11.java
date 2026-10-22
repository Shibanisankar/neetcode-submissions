class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> expected = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            expected.put(s1.charAt(i), expected.getOrDefault(s1.charAt(i), 0) + 1);
        }

        Map<Character, Integer> actual = new HashMap<>();

        int i = 0;
        int j = 0;

        while (j < s2.length()) {
            System.out.println(i + " " + j);
            Character ch = s2.charAt(j);
            actual.put(ch, actual.getOrDefault(ch, 0) + 1);
            if (j - i == s1.length()) {
                if (actual.get(s2.charAt(i)) == 1) {
                    actual.remove(s2.charAt(i));
                } else {
                    actual.put(s2.charAt(i), actual.get(s2.charAt(i)) - 1);
                }
                i++;
            }
            System.out.println(actual);
            if (expected.equals(actual)) {
                return true;
            }

            j++;
        }
        return false;
    }
}
