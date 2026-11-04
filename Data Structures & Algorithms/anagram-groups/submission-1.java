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

        // List<List<String>> output = new ArrayList<>();
        // strs.sort(Comparator.naturalOrder());
        
        Set<String> set_strs = Set.of(sorted_strs);
        Map<String, List<String>> map_strs = new HashMap<>();

        for (String key: set_strs) {
            map_strs.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[Arrays.asList(sorted_strs).indexOf(key)]);
        }
        
        Collection<String> values = map_strs.values();

        return values;
    }
}
