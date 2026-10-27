# Day 9: 1456. Maximum Number of Vowels in a Substring of Given Length

Date: 2026-10-27

Problem: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

Submission: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/submissions/2183313421/

## Sliding windows from basics
A window covers exactly k neighboring items. Slide it one position right: remove the leaving item's contribution and add the entering item's contribution. Neighboring windows share their middle items, so we update a count instead of recounting all k items.

For numbers [3,2,6,4] and k=2, [3,2] has sum 5. Moving to [2,6] removes 3 and adds 6: 5-3+6=8. Moving to [6,4] gives 8-2+4=10. If i is the entering index, i-k is the leaving index.

## Apply the concept to vowels
Each lowercase vowel (a,e,i,o,u) contributes 1; every other character contributes 0. count tracks the current window; best remembers the highest count seen.

1. Count vowels in the first k characters.
2. Set best to that count.
3. For each entering index i from k onward, subtract 1 if s.charAt(i-k) is a vowel, then add 1 if s.charAt(i) is a vowel.
4. Update best after both checks.
5. Return best.

## Dry run
s="abeci", k=3:

| Window | Update | count | best |
| --- | --- | --- | --- |
| abe | First window has a and e | 2 | 2 |
| bec | a leaves (-1), c enters (+0) | 1 | 2 |
| eci | b leaves (-0), i enters (+1) | 2 | 2 |

Return 2.

## Java details
- s.charAt(i) reads the character at index i; s.length() gives the string length.
- isVowel returns a boolean. The operator || means OR.
- Use two separate if statements: a vowel can leave and another vowel can enter in the same slide.
- The first window uses indexes 0 through k-1, so sliding starts at i=k.
- k equal to the string length means there is only one window.

## Complexity
Time: O(n). Extra space: O(1).

## Progress
Accepted (reported by user) on 2026-10-27; solved with guidance after a basic sliding-window lesson and full Java code. Local checks cover official examples, no vowels, all vowels, k=1, k=string length, a singleton, and a maximum-length string.
