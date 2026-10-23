// Rename this class to Solution for a separate LeetCode submission.
class SolutionLinear {
    public boolean isPerfectSquare(int num) {
        int candidate = 1;
        while ((long) candidate * candidate < num) {
            candidate++;
        }
        return (long) candidate * candidate == num;
    }
}
