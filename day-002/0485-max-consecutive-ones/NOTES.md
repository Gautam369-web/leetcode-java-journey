# Day 2: 485. Max Consecutive Ones

Date: 2026-10-20

Problem: https://leetcode.com/problems/max-consecutive-ones/

## Concept
Consecutive ones form an uninterrupted run. count tracks the current run, while best remembers the longest run seen anywhere so far.

- On 1: increment count.
- On 0: reset count to zero.
- After either branch, update best if count is larger.
- Return best after processing all elements.

## Warm-up correction
For [1,1,1,0], after processing zero, count is 0 and best is 3. Reset the current run without erasing the previous best.

## Trace
For [1,1,0,1,1,1], count becomes 1,2,0,1,2,3 and best becomes 1,2,2,2,2,3. Return 3.

## Why it works
After each iteration, count is the length of the run ending at the current element. best is the maximum of all run lengths encountered. Updating during the scan also handles a run that ends at the last element.

## Complexity
Time: O(n), one pass.
Extra space: O(1). The input array is preserved.

## Progress
Accepted on LeetCode, reported by the user on 2026-10-20. Solution completed after guided warm-ups and a template. Local verification covers all zeros, all ones, singleton inputs, multiple separated runs, and a longest run followed by zeros.
