class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i <= j) {
            while( i < j && !isAlphaNum(chars[i])) {
                i++;
            }
            while ( i < j &&!isAlphaNum(chars[j])) {
                System.out.print(chars[j]);
                j--;
            }
            if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphaNum(char ch) {
        return (ch >= 'A' && ch <= 'Z' ||
                ch >= 'a' && ch <= 'z' ||
                ch >= '0' && ch <= '9');
    }
}
