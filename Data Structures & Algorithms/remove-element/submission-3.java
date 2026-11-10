class Solution {
    public int removeElement(int[] nums, int val) {
        int lp = 0, rp = nums.length - 1;
        int count = 0;

        while (lp <= rp) {
            if (nums[lp] != val) {
                lp++;
                count++;
            } else {
                if (nums[rp] == val) {
                    rp--;
                } else {
                    int temp = nums[lp];
                    nums[lp] = nums[rp];
                    nums[rp] = temp;
                    lp++;
                    rp--;
                    count++;
                }
            }
        }
        return count;
    }
    
}