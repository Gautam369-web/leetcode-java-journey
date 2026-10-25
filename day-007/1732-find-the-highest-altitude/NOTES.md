# Day 7: 1732. Find the Highest Altitude

Date: 2026-10-25

Problem: https://leetcode.com/problems/find-the-highest-altitude/
Submission: https://leetcode.com/problems/find-the-highest-altitude/submissions/2181650272/

## Concept
The cyclist starts at altitude 0. gain contains CHANGES in height, not actual heights. Add each change to current to find the next altitude. highest remembers the greatest altitude visited, including the start.

## Approach
Initialize current=0 and highest=0. For each gain, update current, then update highest if current is larger. Return highest, not the final current altitude.

## Dry run
For [2,-5,4]:
- Start: current=0, highest=0.
- Add 2: current=2, highest=2.
- Add -5: current=-3, highest stays 2.
- Add 4: current=1, highest stays 2.
Return 2. The final altitude is 1, but the highest visited was 2.

## Starting altitude matters
For [-2,-3], the heights are 0,-2,-5. Return 0, the starting height. Do not initialize highest to the first gain.

## Complexity
Time: O(n). Extra space: O(1). Input is preserved.

## Progress
Accepted, reported by the user on 2026-10-25 following a concept lesson, full solution, and dry run. Local checks cover mixed changes, only downhill travel, only uphill travel, zero changes, a later peak, and a single change.
