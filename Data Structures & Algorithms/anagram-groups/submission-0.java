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

        List<List<String>> output = new ArrayList<>();
        // strs.sort(Comparator.naturalOrder());
        
        for (int i=0; i<strs.length; i++) {
            List<String> element = new ArrayList<>();
            
            if (strs[i].equals("SKIP")) {
                continue;
            } else {
                // System.out.println("loop 1 " + strs[i] + " added to elements");
                element.add(strs[i]);
            }

            for (int j=i+1; j<strs.length; j++) {
                if (sorted_strs[i].equals(sorted_strs[j])) {

                    // System.out.println("loop 2 " + strs[j] + " added to element");
                    element.add(strs[j]);

                    // System.out.println(strs[j] + " changed to SKIP");
                    strs[j] = "SKIP";

                    // final strs = Arrays.stream(strs)
                    //        .filter(str -> !strs[j].equals(str))
                    //        .toArray(String[]::new);
                    // final sorted_strs = Arrays.stream(sorted_strs)
                    //               .filter(str -> !sorted_strs[j].equals(str))
                    //               .toArray(String[]::new);
                    // strs.remove(strs[j]);
                    // sorted_strs.remove(sorted_strs[j]);
                }
            }
            output.add(element);

            // strs.remove(strs[i]);
        }

        return output;
    }
}
