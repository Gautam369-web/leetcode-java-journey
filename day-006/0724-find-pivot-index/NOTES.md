# Day 6: 724. Find Pivot Index

Date: 2026-10-24

Problem: https://leetcode.com/problems/find-pivot-index/

## Concept
A pivot has equal sums strictly to its left and right. Exclude the current value from both sums. An empty side sums to zero. Return the leftmost pivot index, or -1 if none exists.

## Approach
First calculate the total sum. Scan from left to right with leftSum initially zero. At each index i, calculate rightSum = total - leftSum - nums[i]. If the sides match, return i. Otherwise add nums[i] to leftSum before moving to the next index.

## Why update after checking
Before the comparison, leftSum must contain only values before i. Adding nums[i] earlier would include the pivot itself and break the formula.

## Example
For [1,2,3,3], total=9. At index 2, leftSum=3 and rightSum=9-3-3=3. Return 2.

## Complexity
Time: O(n), two linear passes. Extra space: O(1). Input is preserved.

## Progress
Accepted, reported by the user on 2026-10-24 after a concept lesson and full example solution. Local checks cover a central pivot, absent pivot, empty-side sums, negative values, singleton input, and multiple valid pivots.
