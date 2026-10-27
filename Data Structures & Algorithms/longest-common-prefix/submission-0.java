class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        String min = "";
        int min_size = 200;
        int length = strs.length;
        for (int i=0; i<length; i++) {
            if (strs[i].length() < min_size) {
                min_size = strs[i].length();
                min = strs[i];
            } 
        }

        outerloop:
        for (int i=0; i<min_size; i++) {
            for (int j=0; j<length; j++) {
                if (min.charAt(i) != strs[j].charAt(i)) {
                    break outerloop;
                }
            }
            output += min.charAt(i);
        }

        return output;
    }
}