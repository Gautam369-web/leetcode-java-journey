# Day 4: 34. Find First and Last Position of Element in Sorted Array

Date: 2026-10-22

Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

## Concept
A target can appear repeatedly. Return its first and last zero-based indexes. A single occurrence at index 4 produces [4,4], not [4]. If absent, return [-1,-1].

## Two searches
Initialize first and last to -1. Search for the first occurrence by saving a matching mid and continuing left with r = mid-1. Reset l and r. Search for the last occurrence by saving a matching mid and continuing right with l = mid+1. Return new int[] {first,last}.

## Why continue on a match
A matching position is a valid candidate, but an earlier or later match may still exist. Save the candidate instead of returning immediately.

## Corrections from practice
- Put the comparison inside a complete binary-search loop with l, r, and mid declared.
- A method returning int[] cannot return first, which is an int. Return both indexes in an array.
- Reset search boundaries before the second search.

## Example
For [1,2,2,2,5] and target 2, the first search saves index 2 then improves it to 1. The second search finds the last index 3. Return [1,3]. For target 5 return [4,4]; for target 3 return [-1,-1].

## Complexity
Time: O(log n) for nonempty input. Two logarithmic searches remain O(log n). Empty input takes constant time.
Extra space: O(1), including the fixed-size output. Input is preserved.

## Progress
Accepted, reported by the user on 2026-10-22 after guided exercises and a complete solution. Local checks cover absent values, a singleton, all equal values, runs at either boundary, negatives, and an empty input.
