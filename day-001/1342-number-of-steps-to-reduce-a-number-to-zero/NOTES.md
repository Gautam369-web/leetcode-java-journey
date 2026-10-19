# Problem 4: 1342. Number of Steps to Reduce a Number to Zero

Date: 2026-10-19 (Day 1, fourth problem)

Problem: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

## Concepts
A while loop repeats while its condition is true. While num is positive, divide an even number by 2 or subtract 1 from an odd number. Increment step after the if/else so either operation counts exactly once. Return after the loop.

## Examples and edge case
- 8 -> 4 -> 2 -> 1 -> 0: 4 steps.
- 6 -> 3 -> 2 -> 1 -> 0: 4 steps.
- Input 0 skips the loop and returns 0.

## Why it finishes
Every operation decreases a positive number. An odd number greater than 1 becomes even after subtraction, so a division follows on the next iteration.

## Complexity
Time: O(log(num + 1)) for positive num; zero takes constant time.
Extra space: O(1), only the counter and input variable.

## Progress
User submitted a correct solution following the concept lesson. Local checks: 0, 1, 6, 8, 14, 123, and 1000000. LeetCode acceptance has not yet been reported.
