# Day 7: 303. Range Sum Query - Immutable

Date: 2026-10-25

Problem: https://leetcode.com/problems/range-sum-query-immutable/
Submission: https://leetcode.com/problems/range-sum-query-immutable/submissions/2181625053/

## Concept
A range sum adds the values from left through right, including both endpoints. Immutable means values do not change between queries.

Build totals from the beginning once, then subtract the part before the requested range. For nums=[2,4,1,3], prefix=[0,2,6,7,10]. prefix[k] means the sum of the first k values, so prefix[0]=0.

## Build the totals
Allocate nums.length+1 entries. For each i, set prefix[i+1]=prefix[i]+nums[i]. The extra initial zero makes queries starting at index zero work without a special case.

## Query formula
sumRange(left,right) = prefix[right+1]-prefix[left]. The first term includes every value through right; the second removes everything before left.

## Dry run
- sumRange(1,3): prefix[4]-prefix[1]=10-2=8, which is 4+1+3.
- sumRange(2,3): prefix[4]-prefix[2]=10-6=4, which is 1+3. The amount subtracted is 6; 4 is the final answer.
- sumRange(0,2): prefix[3]-prefix[0]=7-0=7.

## Java structure
Use class NumArray, not Solution. Its constructor NumArray(int[] nums) builds the totals once. The prefix field keeps them available for future sumRange calls. No main method is needed on LeetCode.

## Complexity
Constructor: O(n) time and O(n) stored space.
Each sumRange call: O(1) time and O(1) additional space.
The input array is preserved.

## Progress
Accepted, reported by the user on 2026-10-25 after a concept lesson, full example solution, and dry run. Local checks cover repeated queries, negative values, single-element ranges, full-array ranges, queries starting at zero, and independent objects.
