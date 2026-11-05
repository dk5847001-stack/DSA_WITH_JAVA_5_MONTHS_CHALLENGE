# Monotonic Stack & Next Greater Element — Daily Knowledge

> MONTH-5 · WEEK-2 · DAY-1

## Knowledge Snapshot
- Maintain monotonic increasing/decreasing order; pop while current element resolves the top candidate.
- Next greater: pop while `arr[top] < current`; use `<=` if equal values should not block.
- Each index pushed/popped at most once → O(n) time, O(n) stack space.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
