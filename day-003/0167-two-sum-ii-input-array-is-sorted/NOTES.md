# Day 3: 167. Two Sum II - Input Array Is Sorted

Date: 2026-10-21

Problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

## Requirement
Find two distinct positions in a sorted array whose values add to target. Return their 1-based positions. The problem guarantees exactly one solution.

## Approach
Start left at zero and right at the last index. If the sum equals target, return [left+1,right+1]. If too small, increment left. If too large, decrement right. Use left < right to avoid using the same element twice.

## Why the moves are safe
If the sum is too small, numbers[left] cannot form the target with any remaining number: numbers[right] is already the largest candidate. Discard left. If the sum is too large, numbers[right] cannot form the target with any remaining number: numbers[left] is already the smallest candidate. Discard right.

## Trace
For [2,3,5,9] and target 8:
- 2+9=11: too large, right--.
- 2+5=7: too small, left++.
- 3+5=8: return [2,3].

## Indexing clarification
Java indexes start at 0. The required returned positions start at 1. The values 3 and 5 are at Java indexes 1 and 2, so return positions 2 and 3. The fallback [-1,-1] satisfies Java's return requirement but is unreachable for valid problem inputs.

## Complexity
Time: O(n), as each iteration moves an endpoint inward or returns.
Extra space: O(1), including the fixed two-element output. The input is preserved.

## Progress
Accepted, reported by the user on 2026-10-21 after guided examples and a complete solution. Local checks cover negative values, zero, duplicates, two-element arrays, and moving either endpoint.
