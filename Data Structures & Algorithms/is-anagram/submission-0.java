class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] chars_s = s.toCharArray();
        Arrays.sort(chars_s);
        String sorted_s = new String(chars_s);

        char[] chars_t = t.toCharArray();
        Arrays.sort(chars_t);
        String sorted_t = new String(chars_t);

        if (sorted_s.equals(sorted_t)) {
            return true;
        } else {
            return false;
        }
    }
}
