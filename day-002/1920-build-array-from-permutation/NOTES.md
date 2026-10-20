# Day 2: 1920. Build Array from Permutation

Date: 2026-10-20

Problem: https://leetcode.com/problems/build-array-from-permutation/

## Concept
Use an array value as another index. Evaluate nums[nums[i]] from the inside outward: read nums[i], then use that value to read nums again.

The input is a permutation containing every integer from 0 through n-1 exactly once, so each value is a valid index.

## Trace
For nums = [2,0,1]:
- i = 0: nums[0] = 2, then nums[2] = 1 -> ans[0] = 1.
- i = 1: nums[1] = 0, then nums[0] = 2 -> ans[1] = 2.
- i = 2: nums[2] = 1, then nums[1] = 0 -> ans[2] = 0.
Result: [1,2,0].

## Preserve original values
Store results in a separate array. Directly replacing nums[i] during this loop can change values needed by later lookups.

## Complexity
Time: O(n), one loop and two constant-time lookups per element.
Output space: O(n). Auxiliary space excluding the result: O(1).

## Progress
User correctly completed both indexing warm-ups and the solution after a guided lesson. Local checks cover the two official examples, a singleton, the lesson example, and an identity permutation. LeetCode Accepted, reported by the user on 2026-10-20. Submission: https://leetcode.com/problems/build-array-from-permutation/submissions/2176978429/
