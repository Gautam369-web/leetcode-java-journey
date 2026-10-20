# Day 1: Running Sum of 1d Array

Date: 2026-10-19

## Concept
An array uses zero-based indexes. A running total accumulates each value visited by a loop. Store each total at the same index in the result array.

For [1, 2, 3, 4], the stored totals are [1, 3, 6, 10].

## Mistake and fix
The first attempt printed the correct totals, but returned an array of zeros. Printing changes stdout; it does not fill an array. Adding `result[i] = total;` stores each answer.

## Why it works
After processing index i, total equals the sum of nums[0] through nums[i]. Storing it in result[i] gives the required prefix sum. The original array is preserved.

## Complexity
- Time: O(n), one visit per element.
- Extra space: O(n), a new result array; total and i use O(1).

## Warm-ups assigned
1. Print every element of [2, 4, 1, 3].
2. Calculate its final sum (10).
3. Count its even elements (2).

Warm-up completion has not been reported.

## Progress
User submitted the corrected solution after a hint and example solution. Local checks cover ordinary input, one element, zeros, negatives, and mixed signs. LeetCode Accepted, confirmed by the user on 2026-10-20.
