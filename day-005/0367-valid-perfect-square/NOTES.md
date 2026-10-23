# Day 5: 367. Valid Perfect Square

Date: 2026-10-23

Problem: https://leetcode.com/problems/valid-perfect-square/

## Concept
A perfect square equals a whole number multiplied by itself. Return a boolean: 36 is true because 6*6=36; 15 is false. Unlike problem 69, do not return a rounded-down root.

## Binary search: Solution.java
Search candidates from 1 through num. Calculate mid and its square using long. Return true on equality. If the square is too small, set left=mid+1; otherwise set right=mid-1. If the search ends without an exact match, return false.

## Linear search: SolutionLinear.java
Start candidate at 1 and increase it while its square is smaller than num. Stop at the first square at least as large as num; return whether it equals num. For 16, stop at 4 and return true. For 15, stop at 4 and return false. Rename the class to Solution to submit separately.

## Overflow safety
Cast before multiplication: (long) candidate * candidate or (long) mid * mid. An int square may overflow for large candidates.

## Comparison
- Binary search: O(log num) time, O(1) extra space.
- Linear search: O(sqrt(num)) time, O(1) extra space.
- Linear search is simpler to trace; binary search performs fewer checks for large inputs.

## Input assumptions
The LeetCode problem provides a positive integer num. These implementations target that domain.

## Progress
Both methods accepted on LeetCode, confirmed by the user on 2026-10-23 after a guided concept lesson and complete example solutions. Local checks include 1, perfect squares, values between squares, large square boundaries, and Integer.MAX_VALUE.
