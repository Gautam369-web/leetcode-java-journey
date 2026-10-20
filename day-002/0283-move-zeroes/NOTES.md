# Day 2: 283. Move Zeroes

Date: 2026-10-20

Problem: https://leetcode.com/problems/move-zeroes/
Submission: https://leetcode.com/problems/move-zeroes/submissions/2177085957/

## Approach
Use i to read every element and write to track the next position for a nonzero value. Copy nonzero values forward in their original order. After the first loop, fill all positions from write to the end with zeros.

## Trace
For [4,0,2,0,7], the first loop produces [4,2,7,0,7] and write = 3. The old trailing values do not matter yet. The second loop fills indexes 3 and 4 with zero, producing [4,2,7,0,0].

## Corrections from practice
- write is an index, not the list of nonzero values. After collecting three nonzero values, write = 3.
- Assignment copies from right to left: nums[write] = nums[i]. Reversing it can destroy unread values.
- A void method does not return a value. LeetCode checks the modified original array.

## Why this is safe
write never exceeds i during the first loop, so copying forward does not overwrite values that are still waiting to be read. Scanning from left to right preserves nonzero order.

## Complexity
Time: O(n). The first loop reads n elements and the second fills at most n elements.
Extra space: O(1). No new array is created.

## Progress
Accepted, reported by the user on 2026-10-20 after guided corrections. Local checks cover mixed values, all zeros, no zeros, single elements, and negative nonzero values.
