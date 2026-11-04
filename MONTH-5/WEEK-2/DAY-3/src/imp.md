# Monotonic Queue & Sliding Window Maximum — Important Notes

> Month 5 · Week 2 · Day 3 | Quick revision sheet

## Must Remember
- Sliding-window maximum: decreasing deque of indices; front is max for current window.
- Remove expired indices from front (`index <= i-k`); remove dominated values from back.
- Each index enters/leaves once → O(n) time, O(k) space.
- Store indices, not only values, to expire duplicates correctly.

## Complexity / Correctness
- Count each element/index once where amortized O(n) is claimed.
- Include stack/deque/map/prefix arrays and recursion stack.
- State strict vs non-strict comparisons and input assumptions.

## Common Traps
- Off-by-one window/range boundaries, duplicate expiry, and overflow.
- Binary-search predicate not proven monotonic.
- Java int shift width, UTF-16 char assumptions, and null/head edge cases.

## Before Moving On
- [ ] Explain invariant and edge conditions.
- [ ] Implement in Java and test boundaries.
- [ ] State time and auxiliary-space complexity.
