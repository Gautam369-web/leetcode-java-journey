# Day 11: 1. Two Sum

Date: 2026-10-29

Problem: https://leetcode.com/problems/two-sum/

## New topic: HashMap
A HashMap is a lookup notebook that stores a key and a value. In this solution, it maps each number already seen to its index: `number -> index`. Java uses `map.put(number, index)` to store an entry, `map.containsKey(number)` to ask whether a number exists, and `map.get(number)` to get its index.

## The complement idea
For the current number, calculate the number needed to reach the target:

`needed = target - currentNumber`

If the needed number was seen earlier, its saved index and the current index form the answer. Otherwise, store the current number and its index.

## Dry run
For `nums = [3,2,4]`, `target = 6`:

| Index | Current number | Needed | Map before checking | Action |
| --- | --- | --- | --- | --- |
| 0 | 3 | 3 | `{}` | Store `3 -> 0` |
| 1 | 2 | 4 | `{3 -> 0}` | Store `2 -> 1` |
| 2 | 4 | 2 | `{3 -> 0, 2 -> 1}` | Find 2 at index 1; return `[1,2]` |

## Important order
Check the map before storing the current number. That prevents using the same array element twice. It also handles duplicate values correctly: for `[3,3]`, target 6, the first 3 is stored and the second 3 finds it.

The `return new int[] {map.get(needed), i};` line creates and returns an integer array containing the two indexes. The final `[-1,-1]` is a safe fallback; LeetCode guarantees one valid answer for this question.

## Complexity
Time: O(n) average. Extra space: O(n). The input array is preserved.

## Progress
Accepted (reported by user) on 2026-10-29 after a HashMap concept-first lesson and guided Java code. Local validation covers the official examples, duplicate values, negative numbers, zero, and randomized arrays against a direct pair search.
