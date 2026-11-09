class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted_strs = Arrays.copyOf(strs, strs.length);
        
        for (int i=0; i<strs.length; i++) {
            String original = strs[i];
            char[] chars = original.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            sorted_strs[i] = sorted;
        }
        
        HashMap<String, List<String>> map_strs = new HashMap<>();

        for (int i=0; i<sorted_strs.length; i++) {
            map_strs.computeIfAbsent(sorted_strs[i], k -> new ArrayList<>()).add(strs[i]);
        }

        
        Collection<List<String>> values = map_strs.values();

        List<List<String>> list = new ArrayList<>(values);

        return list;
    }
}
