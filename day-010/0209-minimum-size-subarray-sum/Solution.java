class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int best = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            // Grow the window.
            sum += nums[right];

            // Record qualifying lengths and shrink the window.
            while (sum >= target) {
                best = Math.min(best, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if (best == Integer.MAX_VALUE) {
            return 0;
        }
        return best;
    }
}
