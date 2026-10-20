# Problem 3: 412. Fizz Buzz

Date: 2026-10-19 (Day 1, third problem)

Problem: https://leetcode.com/problems/fizz-buzz/

## Concepts
- `%` gives a remainder; `i % 3 == 0` means divisible by 3.
- `&&` means both conditions must be true.
- Check divisibility by both 3 and 5 first, then the individual cases.
- An if/else-if/else chain selects exactly one result per number.
- `List<String> answer = new ArrayList<>();` creates a growable list of strings.
- `answer.add(...)` appends a string.
- `String.valueOf(i)` converts an integer to a string.
- Return the list after the loop.

## Example
For n = 5: ["1", "2", "Fizz", "4", "Buzz"]. For 15, add "FizzBuzz".

## Complexity
Let d be the number of decimal digits in n. With integer-to-string conversion counted, time and returned text storage are O(n * d), or O(n log n) asymptotically. A simplified analysis that treats integer conversion as constant time gives O(n) time and O(n) output entries. Auxiliary space excluding the returned list and its strings is O(1).

## Progress
Correct user solution after guided exercises and a conditional example. Local checks cover n = 1, 3, 5, 15, and 30. LeetCode Accepted, confirmed by the user on 2026-10-20.
