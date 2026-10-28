# Day 10: 209. Minimum Size Subarray Sum

Date: 2026-10-28

Problem: https://leetcode.com/problems/minimum-size-subarray-sum/

Submission: https://leetcode.com/problems/minimum-size-subarray-sum/submissions/2184185774/

## Concept first: a window that grows and shrinks
Find the shortest group of neighboring positive numbers whose sum is at least target. A variable-size window can grow by adding a number at the right and shrink by removing a number at the left.

For [2,3,4], target=7: grow through [2] (sum 2), [2,3] (5), [2,3,4] (9). Record length 3. Remove 2: [3,4] has sum 7, so record length 2. Remove 3: [4] has sum 4, so stop shrinking. Return 2.

The learner correctly identified that removing 4 from [4,2,5] leaves [2,5], whose sum 7 still qualifies for target 7.

## Why it works
All values are positive. Extending the window increases its sum; removing the leftmost value decreases it. For each right endpoint, keep shrinking while the sum qualifies to consider shorter valid windows. After a start position is removed, future windows with that same start would only be longer than a valid window already considered.

## Java steps
- left starts at 0; sum starts at 0.
- best starts at Integer.MAX_VALUE as a marker for no qualifying window yet.
- Move right through the array and add nums[right].
- While sum >= target, record Math.min(best, right-left+1), subtract nums[left], and increment left.
- Record the length before removing an item: the current window qualifies, but the smaller one may not.
- Use while rather than if because several removals may still leave a qualifying window.
- Return 0 if best was never updated; otherwise return best.

## Worked example
nums=[2,3,1,2,4,3], target=7:

| right | Sum after adding | Qualifying windows before each removal | Sum after shrinking | best |
| --- | --- | --- | --- | --- |
| 0 | 2 | None | 2 | Unset |
| 1 | 5 | None | 5 | Unset |
| 2 | 6 | None | 6 | Unset |
| 3 | 8 | [2,3,1,2], length 4 | 6 | 4 |
| 4 | 10 | [3,1,2,4], length 4; [1,2,4], length 3 | 6 | 3 |
| 5 | 9 | [2,4,3], length 3; [4,3], length 2 | 3 | 2 |

Return 2.

## Complexity
Time: O(n). Each element enters and leaves at most once despite the nested loops. Extra space: O(1). Input is preserved. This approach relies on positive input values as specified in this problem.

## Progress
Accepted (reported by user) on 2026-10-28 after a concept-first lesson, warm-up, and guided Java code. Local validation includes official examples, no solution, equality, a singleton, a full-array answer, repeated shrinking, and maximum constraint values, plus comparison with exhaustive window enumeration on small random inputs.
