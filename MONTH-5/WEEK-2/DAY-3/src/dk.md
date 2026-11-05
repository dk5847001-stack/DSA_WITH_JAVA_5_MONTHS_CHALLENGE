# Monotonic Queue & Sliding Window Maximum — Daily Knowledge

> MONTH-5 · WEEK-2 · DAY-3

## Knowledge Snapshot
- Sliding-window maximum: decreasing deque of indices; front is max for current window.
- Remove expired indices from front (`index <= i-k`); remove dominated values from back.
- Each index enters/leaves once → O(n) time, O(k) space.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
