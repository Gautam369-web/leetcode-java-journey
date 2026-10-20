# Day 2: 1929. Concatenation of Array

Date: 2026-10-20

Problem: https://leetcode.com/problems/concatenation-of-array/

## Concept
Concatenation joins sequences. The answer holds two copies of the original array, in the same order.

n is the ORIGINAL array length. For [5,9], n = 2 and the answer length is 2*n = 4.

For each original index i, copy nums[i] into ans[i] and ans[i+n]. The second position is n places after the first.

## Trace
For nums = [5,9], start with ans = [0,0,0,0].
- i = 0: write 5 at indexes 0 and 2 -> [5,0,5,0].
- i = 1: write 9 at indexes 1 and 3 -> [5,9,5,9].

## Bounds
The loop runs while i < n. The largest second-half index is (n-1)+n = 2*n-1, which is the last valid index of ans.

## Complexity
Time: O(n), copying each element twice.
Output space: O(n), for 2*n values. Auxiliary space excluding the output: O(1).
The input array is preserved.

## Progress
User completed the correct solution after a guided indexing lesson and template. Corrected confusion between original length n and output length 2*n. Passed five local cases, including one element, repeated values, and the maximum input length. LeetCode acceptance has not yet been confirmed.
