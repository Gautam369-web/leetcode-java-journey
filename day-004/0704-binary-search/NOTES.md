# Day 4: 704. Binary Search

Date: 2026-10-22

Problem: https://leetcode.com/problems/binary-search/

## Concept first
In a sorted array, comparing the middle value with a target lets us discard roughly half the remaining positions. l and r are the boundaries of the remaining search area, not selected answers. If searching right, move l to mark where that right-hand area begins.

## Algorithm
Start l = 0 and r = nums.length-1. While l <= r, calculate mid = l + (r-l)/2. Return mid if nums[mid] equals target. If nums[mid] is too small, set l = mid+1; otherwise set r = mid-1. Return -1 when no positions remain.

## Corrections from practice
- mid is an INDEX; nums[mid] is the VALUE. Compare target with nums[mid] and return mid.
- Recalculate mid inside the loop after boundaries change.
- Use l <= r so the final single position is checked.
- Exclude the checked middle using +1 or -1, ensuring progress.
- Java indexes start at zero. Do not add 1 as in problem 167.

## Trace
For [2,4,6,8,10], target 10:
- l=0, r=4, mid=2, value=6 -> l=3.
- l=3, r=4, mid=3, value=8 -> l=4.
- l=4, r=4, mid=4, value=10 -> return 4.

## Complexity
Time: O(log n), halving the search area each iteration.
Extra space: O(1). Input is preserved.

## Progress
Accepted, reported by the user on 2026-10-22 after a concept lesson, boundary clarification, and guided corrections. Local checks cover first/last/middle matches, absent targets inside and outside the range, negatives, and singleton arrays.
