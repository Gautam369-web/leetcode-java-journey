# Problem 5: 1295. Find Numbers with Even Number of Digits

Date: 2026-10-19 (Day 1, fifth problem)

Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

## Approach
Visit each number. Copy it into n, reset digit to zero, then repeatedly divide n by 10 and increment digit until n becomes zero. After counting, increment ans if digit is even. Return ans after visiting the entire array.

## Key distinction
Check whether the DIGIT COUNT is even, not whether the number is even. For example, 23 is odd but has two digits, so it qualifies.

## Mistakes corrected
- The for loop needs int i = 0.
- Keep one counter for qualifying numbers outside the for loop and a separate digit counter inside it.
- Divide by 10 on every while iteration; do not use the even/odd operations from problem 1342.
- Check the completed digit count after the while loop.

## Trace
[7,42,100,1234] has digit counts [1,2,3,4]. Only 42 and 1234 qualify, so return 2.

## Complexity
Time: O(N * D), with N input numbers and D the maximum number of digits. Extra space: O(1). The input array is preserved.

## Input assumptions
The problem specifies positive integers. A general digit counter would need a separate case for zero, which has one digit.

## Progress
Correct user solution after guided corrections. Passed local checks for ordinary examples, one-digit inputs, powers of ten, and the maximum allowed value. LeetCode Accepted, confirmed by the user on 2026-10-20.
