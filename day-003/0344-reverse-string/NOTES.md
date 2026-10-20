# Day 3: 344. Reverse String

Date: 2026-10-21

Problem: https://leetcode.com/problems/reverse-string/

## Two methods
Solution.java uses a temporary char. SolutionXor.java uses three XOR operations. Both reverse the input character array directly; neither returns a value. Rename SolutionXor to Solution for a separate LeetCode submission.

## Approach
Start l at zero and r at s.length-1. While l < r, swap the characters at those positions, increment l, and decrement r. Stop when the indexes meet or cross; an odd-length middle character stays in place.

## Corrections from practice
- Swap s[l] and s[r], not l and r. The indexes identify positions; the array elements contain characters.
- Use r-- to move toward the middle. r++ moves beyond the array bounds.
- Java promotes char operands to int for XOR. Plain assignment requires a cast: s[l] = (char)(s[l] ^ s[r]). Compound assignment s[l] ^= s[r] includes the conversion.
- XOR identities: a ^ a = 0, a ^ 0 = a. Three XOR updates exchange two distinct storage locations.
- Keep l < r. XOR-swapping an element with itself zeros that element. Equal character values at distinct indexes are safe.

## Trace
For [j,a,v,a], swapping indexes 0 and 3 gives [a,a,v,j]; swapping indexes 1 and 2 gives [a,v,a,j].

## Complexity
Both methods: O(n) time and O(1) extra space. XOR has no asymptotic advantage; the temporary-variable version is clearer to read.

## Progress
Both methods accepted on LeetCode, confirmed by the user on 2026-10-21. Tested locally on odd/even lengths, one character, repeated characters, spaces, and mixed case.
