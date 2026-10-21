# Day 3: 977. Squares of a Sorted Array

Date: 2026-10-21

Problem: https://leetcode.com/problems/squares-of-a-sorted-array/

## Concept
Squaring a sorted array containing negative numbers may change the order: [-3,-1,2] squares to [9,1,4]. Return [1,4,9].

## Approach
Use left and right at the ends of the original sorted array. The largest remaining square is at one of those ends. Compare their squares, put the larger into ans[pos], move only the input index used, and decrement pos. Fill the output from right to left.

Use left <= right so the final remaining element is processed. On a tie, either side is valid; this solution takes the right side.

## Trace
For [-3,-1,2]: compare 9 and 4, store 9 at index 2; compare 1 and 4, store 4 at index 1; store the remaining 1 at index 0. Result: [1,4,9].

## Why it works
The largest absolute value in any remaining sorted interval is at an endpoint. Each iteration places the largest remaining square in the last free position, preserving the sorted suffix already built.

## Complexity
Time: O(n), with exactly one output position filled per iteration.
Output space: O(n). Auxiliary space excluding the returned array: O(1).
The input array is preserved. Input values are between -10000 and 10000, so their squares fit in a Java int.

## Progress
Accepted, reported by the user on 2026-10-21 after correctly completing warm-ups and the guided template. Local tests cover mixed signs, all negative, all nonnegative, singleton, equal squares, and boundary magnitudes.
