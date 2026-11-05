# Recursive Binary Search & Occurrences — Daily Knowledge

> MONTH-2 · WEEK-2 · DAY-3

## Knowledge Snapshot
- Binary search requires sorted data (or a monotonic predicate); each step halves the candidate interval.
- Use `mid = low + (high-low)/2` to avoid overflow; loop while `low <= high` for exact-match search.
- Time O(log n), iterative extra space O(1); recursive version uses O(log n) stack.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
