# Day 3: 125. Valid Palindrome

Date: 2026-10-21

Problem: https://leetcode.com/problems/valid-palindrome/

## Requirement
Compare letters and digits only, ignoring case. Return true when they read the same forward and backward. Text with no letters or digits also qualifies.

## Approach
Start l at zero and r at s.length()-1. Skip a non-alphanumeric character by moving its index inward. Otherwise compare both characters after converting them to lowercase. Return false on a mismatch. On a match, move both indexes inward. Return true after all pairs pass.

## Java basics
- s.length() gives the string length.
- s.charAt(index) reads one character.
- Character.isLetterOrDigit checks whether a character should be compared.
- Character.toLowerCase normalizes the comparison.

## Time-limit error and fix
The user's right-side punctuation branch was empty. With a punctuation character at r, neither index moved, causing an infinite loop. Adding r-- fixed it. Example: for "aba!", skip ! before comparing a with a.

Every loop iteration must either move an index inward or return. This ensures the loop makes progress.

## Complexity
Time: O(n), because indexes move inward without revisiting positions.
Extra space: O(1). The string is read without constructing a cleaned copy.

## Progress
Accepted, reported by the user on 2026-10-21 after guided explanation, a complete example solution, and debugging. Local checks cover mixed case, digits, punctuation at either end, punctuation-only text, mismatches, and the maximum allowed length.
