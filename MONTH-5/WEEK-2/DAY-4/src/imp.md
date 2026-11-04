# Advanced Binary Search & Search on Answer — Important Notes

> Month 5 · Week 2 · Day 4 | Quick revision sheet

## Must Remember
- Binary search on answer needs a monotonic feasibility predicate `can(mid)`.
- Prove false→true or true→false direction; use first-true/last-true template consistently.
- Set bounds from constraints and avoid overflow in midpoint/answer arithmetic.
- Complexity = O(log range × cost(can(mid))).

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
