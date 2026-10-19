class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total+nums[i];
            result[i] = total;
        }

        return result;
    }
}
