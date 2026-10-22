class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String str: strs){
            builder.append(str.length());
            builder.append("#");
            builder.append(str);
        }
        System.out.print(builder.toString());
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i+len;
            res.add(str.substring(i,j));
            i = j;
        }
        return res;
    }
}
