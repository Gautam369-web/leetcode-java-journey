# Day 4: 69. Sqrt(x)

Date: 2026-10-22

Problem: https://leetcode.com/problems/sqrtx/
Submission: https://leetcode.com/problems/sqrtx/submissions/2179106677/

## Concept
Return the nonnegative square root rounded down: the largest integer k for which k*k <= x. For x=20, return 4 because 16 <= 20 but 25 > 20.

## Binary search over candidate answers
Search the integers from 0 through x without creating an array. A candidate whose square fits is valid: save it in answer and search for a larger candidate using left=mid+1. If its square exceeds x, search smaller candidates using right=mid-1. Return the largest valid candidate saved.

## Trace
For x=20, candidates are 10 (too large), 4 (valid, save it), 7 (too large), 5 (too large). Return 4.

## Java overflow
Use long square = (long) mid * mid. Casting an operand before multiplication makes the multiplication use long arithmetic. Simply assigning mid*mid to a long would still perform int multiplication first and could overflow.

## Complexity
Time: O(log(x+1)) for positive x; zero takes constant time.
Extra space: O(1).

## Progress
Accepted, reported by the user on 2026-10-22 following a concept lesson and a full example solution. Local checks include zero, one, perfect squares, values between squares, and Integer.MAX_VALUE.
