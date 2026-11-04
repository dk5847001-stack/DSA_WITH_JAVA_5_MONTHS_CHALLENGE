# Largest Rectangle in Histogram — Important Notes

> Month 5 · Week 2 · Day 2 | Quick revision sheet

## Must Remember
- For each bar, find nearest smaller bar on left/right using a monotonic increasing stack.
- When popping index mid at i, width = `i - newStackTop - 1`; area = height[mid] × width.
- Add a sentinel/flush remaining stack; use long for area if height×width may overflow.
- O(n) time, O(n) stack space.

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
