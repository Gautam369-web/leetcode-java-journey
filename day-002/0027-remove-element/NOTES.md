# Day 2: 27. Remove Element

Date: 2026-10-20

Problem: https://leetcode.com/problems/remove-element/

## Requirement
Keep every value different from val in the first k positions of the original array and return k, the number kept. Java arrays do not shrink. Positions at or after k are ignored, and the problem allows the kept values in any order.

## Approach
Use i to read and write to track the next free position for a kept value. When nums[i] != val, assign nums[write] = nums[i] and increment write. Return write after the loop.

## Example
For nums = [0,1,2,2,3,0,4,2] and val = 2, this approach puts [0,1,3,0,4] in the first five positions and returns 5. The example [0,1,4,0,3] is also valid because order is unrestricted. Zeros are retained because val is 2.

## Connection to Move Zeroes
Both use read/write indexes. Remove Element keeps values unequal to val, returns the kept count, and needs no zero-filling loop.

## Why it works
Before each iteration, nums[0..write) contains exactly the kept values already visited. write never exceeds i, so a copy does not overwrite unread elements. This implementation also preserves the original order of kept values.

## Complexity
Time: O(n). Extra space: O(1).

## Progress
Accepted, confirmed by the user on 2026-10-20. Solved after a guided lesson on the retained prefix, return count, and ignored trailing positions. Local checks cover empty arrays, all removed, none removed, mixed values, and singletons.
