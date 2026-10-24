# Day 6: 852. Peak Index in a Mountain Array

Accepted: 2026-10-24. Lesson started on 2026-10-23.

Problem: https://leetcode.com/problems/peak-index-in-a-mountain-array/

## Concept
A mountain array strictly increases to a peak then strictly decreases. Return the peak index, not its value. The problem guarantees a valid mountain.

## Binary search by slope
Compare arr[mid] with arr[mid+1]. If increasing, mid cannot be the peak, so set left=mid+1. If decreasing, the peak is at mid or to its left, so retain mid with right=mid.

Use while(left < right). With this condition and the floor midpoint, mid < right, so mid+1 stays within bounds. Each update shrinks the candidate range. When left equals right, the one remaining index is the peak.

## Trace
For [2,5,9,6,1]:
- left=0, right=4, mid=2: 9>6, set right=2.
- left=0, right=2, mid=1: 5<9, set left=2.
- Return 2, the peak index; the peak value is 9.

## Corrections from practice
- Repeat comparisons in a while loop rather than making a single decision.
- Recalculate mid inside the loop.
- Return the converged left index, not mid-1.
- Keep right=mid on a downhill comparison because mid might be the peak.

## Complexity
Time: O(log n). Extra space: O(1). The input array is preserved.

## Progress
Accepted, reported by the user on 2026-10-24 after guided warm-ups and corrections. Local checks cover the shortest mountain, peaks near either end, a central peak, and a maximum-length mountain.
