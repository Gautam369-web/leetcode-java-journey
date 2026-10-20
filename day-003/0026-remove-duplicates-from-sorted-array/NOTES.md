# Day 3: 26. Remove Duplicates from Sorted Array

Accepted: 2026-10-21. Lesson started on 2026-10-20.

Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Requirement
Keep one copy of every distinct value at the front of the original sorted array, preserving sorted order. Return the number kept. Positions after that count are ignored.

## Approach
The input is guaranteed nonempty, so keep the first element and start write at 1. Scan from i = 1. Compare nums[i] with nums[write-1], the last value kept. If different, copy nums[i] to nums[write] and increment write. Return write after the loop.

## Why sorted order matters
Equal values are adjacent. A value different from the last kept value is a new distinct value. This logic is not a general solution for unsorted arrays.

## Trace
For [0,0,1,1,2,3,3], keep 0 first. Skip the second 0; keep 1; skip the next 1; keep 2 and 3; skip the last 3. Return 4 with [0,1,2,3] in the first four positions.

## Lesson clarification
The first value is kept because no value has been kept before it. It cannot duplicate an already-kept value. write represents both the number kept and the next free position.

## Complexity
Time: O(n). Extra space: O(1). The original array is modified.

## Progress
Accepted, reported by the user on 2026-10-21 after guided warm-ups and a template. Local checks cover one element, all duplicates, all distinct values, mixed groups, and negative values.
