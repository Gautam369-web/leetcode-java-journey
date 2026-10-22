# Day 4: 35. Search Insert Position

Date: 2026-10-22

Problem: https://leetcode.com/problems/search-insert-position/

## Concept
Return the target's current index if present; otherwise return the index where it belongs to preserve sorted order. Do not actually insert into the array. A returned index of nums.length means insertion after the last element.

## Connection to Binary Search
Use the same inclusive bounds and comparisons as problem 704. Return mid on a match. The change is the final return: return l instead of -1.

## Why return l
Every index before l has a value smaller than target. Every index after r has a value larger than target. If no match is found, the bounds cross and l marks the insertion position between those regions.

## Trace
For [2,4,8,10], target 6:
- l=0, r=3, mid=1, value=4 -> l=2.
- l=2, r=3, mid=2, value=8 -> r=1.
- l > r: return l=2.
For target 12, return 4. The last existing index is 3, but insertion after it is position 4.

## Complexity
Time: O(log n). Extra space: O(1). Input is preserved.

## Progress
Accepted, reported by the user on 2026-10-22 after a concept lesson and adapting their accepted binary search. Local checks cover existing targets, insertion between values, before/after all values, negatives, and singleton arrays.
