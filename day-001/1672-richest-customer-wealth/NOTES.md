# Problem 2: 1672. Richest Customer Wealth

Date: 2026-10-19 (Day 1, second problem)

Problem: https://leetcode.com/problems/richest-customer-wealth/

## Approach
Use an outer loop for customers and an inner loop for each customer's balances. Reset total to zero for every row. After the inner loop, compare the complete row total with maxWealth. Return the maximum after all rows.

## Lessons from practice
- Start maxWealth at zero because balances are positive; do not hardcode an expected answer.
- Compare only after adding the entire row.
- Return after the outer loop, otherwise later rows are skipped.
- Printing displays a value; returning provides the answer to LeetCode.

## Trace
For [[1,4,2],[3,2,5],[6,1,1]], row sums are 7, 10, 8. The maximum changes 0 -> 7 -> 10 -> 10.

## Complexity
Time: O(m * n), where m is the number of customers and n is the number of balances per customer.
Extra space: O(1). The input array is preserved.

## Progress
User submitted the correct solution after guided warm-ups. Passed five local checks; LeetCode Accepted, confirmed by the user on 2026-10-20.
