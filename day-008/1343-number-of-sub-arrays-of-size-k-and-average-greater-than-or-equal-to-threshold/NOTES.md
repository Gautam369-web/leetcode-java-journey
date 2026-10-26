# Day 8: 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Date: 2026-10-26

Problem: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

## Concept
Count groups of exactly k neighboring numbers whose average is at least threshold. Since k is positive, sum / k >= threshold is equivalent to sum >= k * threshold. Compare sums directly to avoid division.

## Approach
1. Calculate requiredSum = k * threshold and the first window sum.
2. Count the first window if sum >= requiredSum.
3. For each entering index i from k onward, subtract arr[i-k] (leaving) and add arr[i] (entering).
4. Check the updated sum and count qualifying windows.
5. Return count.

## Warm-up
For [1,3,5,7], k=2, threshold=4, the windows are [1,3], [3,5], [5,7]. Their averages are 2, 4, 6. Two windows qualify. The learner answered all three parts correctly.

## Dry run
arr = [2,2,2,2,5,5,5,8], k=3, threshold=4. Required sum = 12.

| Indexes | Window | Sum calculation | Qualifies? | Count |
| --- | --- | --- | --- | --- |
| 0-2 | [2,2,2] | 6 | No | 0 |
| 1-3 | [2,2,2] | 6 - 2 + 2 = 6 | No | 0 |
| 2-4 | [2,2,5] | 6 - 2 + 5 = 9 | No | 0 |
| 3-5 | [2,5,5] | 9 - 2 + 5 = 12 | Yes | 1 |
| 4-6 | [5,5,5] | 12 - 2 + 5 = 15 | Yes | 2 |
| 5-7 | [5,5,8] | 15 - 5 + 8 = 18 | Yes | 3 |

Return 3. The qualifying averages are 4, 5, and 6.

## Things to remember
- Equality qualifies: use >=, because the question says at least.
- Check the first window before sliding.
- i is the entering index; i-k is the leaving index.
- Identical values at different positions form different windows.
- Return the count of qualifying windows.
- Under the problem constraints, the window sum and k * threshold fit in int.

## Complexity
Time: O(n). Extra space: O(1). The input array is preserved.

## Progress
Accepted, reported by the user on 2026-10-26 after a concept lesson, warm-up, dry run, and guided full code. Local validation covers the official example, equality, no qualifying windows, k=1, k=array length, a singleton, and maximum constraint values, with randomized comparison against direct window sums.
