class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> final_nums = new ArrayList<>(); 
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                final_nums.add(nums[i]);
            }
        }

        for (int i = 0; i < final_nums.size(); i++) {
            nums[i] = final_nums.get(i);
        }

        int k = final_nums.size();

        return k;
    }
    
}