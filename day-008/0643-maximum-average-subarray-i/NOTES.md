# Day 8: 643. Maximum Average Subarray I

Date: 2026-10-26

Problem: https://leetcode.com/problems/maximum-average-subarray-i/

## Concept
A window is a group of exactly k neighboring values. Move it one position at a time, without skipping values. Average is the sum divided by k. Since every window has the same size, the largest sum also gives the largest average.

## Sliding the window
Build the first window sum. For each next position i, nums[i-k] leaves and nums[i] enters: sum = sum - nums[i-k] + nums[i]. Compare with bestSum after each update.

## Dry run
For [1,12,-5,-6,50,3], k=4:
- First window [1,12,-5,-6]: sum=2, bestSum=2.
- Remove 1 and add 50: sum=51, bestSum=51.
- Remove 12 and add 3: sum=42, bestSum stays 51.
Return 51/4 = 12.75.

## Lessons from practice
- k is the number of elements in each group. For k=2, use pairs, not triples.
- Initialize bestSum to the first actual window sum, not zero; all windows may be negative.
- Cast before division: (double) bestSum / k preserves the fractional part.
- If k equals the array length, there is one window and the second loop is skipped.

## Complexity
Time: O(n). Extra space: O(1). Input is preserved.

## Progress
Accepted, reported by the user on 2026-10-26 after a concept lesson, complete code example, and dry run. Local checks include the official example, negative-only windows, k=1, k=array length, fractional results, and a singleton.
