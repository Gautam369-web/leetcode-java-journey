// Rename this class to Solution for a separate LeetCode submission.
class SolutionLinear {
    public int mySqrt(int x) {
        int candidate = 1;
        while ((long) candidate * candidate <= x) {
            candidate++;
        }
        return candidate - 1;
    }
}
