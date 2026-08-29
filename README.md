# HDFC Life Claim Algorithms

Plain Java console application demonstrating array manipulation and
common algorithmic techniques using weekly claim amounts.

## Seed Data

[25000, 18000, 42000, 15000, 31000, 9000]

## Algorithms and Complexity

| Method | Time Complexity | Extra Space |
|---|---|---|
| Array insert | O(n) | O(1) |
| Array delete | O(n) | O(1) |
| Brute-force pair sum | O(n^2) | O(1) |
| Two-pointer pair sum | O(n log n) | O(n) |
| Palindrome checker | O(d) | O(d) |
| Partition | O(n) | O(1) |
| Sliding-window max sum | O(n) | O(1) |
| Longest unique substring | O(n) average | O(n) |
| Recursive binary search | O(log n) | O(log n) |

## Why Two-Pointer Pair Sum?

For 1,000,000 daily claim amounts, brute-force pair sum is not practical
because it checks approximately n^2 pairs. This gives O(n^2) time and would
require an enormous number of comparisons. The two-pointer approach first
sorts the data and then scans it using left and right pointers. Its overall
complexity is O(n log n) because sorting dominates the linear scan. Therefore,
the two-pointer approach is much more suitable for a very large dataset.

## Algorithms Used

1. Array insertion and deletion using shifting
2. Brute-force pair sum
3. Two-pointer pair sum
4. Palindrome checking using two pointers
5. Hoare-style partition
6. Sliding-window maximum sum
7. Longest substring without repeating characters
8. Recursive binary search

## Exceptions

All custom exceptions extend RuntimeException:

- AlgorithmException
- InvalidIndexException
- StoreFullException
- PairNotFoundException
- InvalidWindowException