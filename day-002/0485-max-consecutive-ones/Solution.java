class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int best = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > best) {
                best = count;
            }
        }
        return best;
    }
}
