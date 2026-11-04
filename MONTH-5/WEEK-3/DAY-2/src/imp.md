# String + Sliding Window Interview Problems — Important Notes

> Month 5 · Week 3 · Day 2 | Quick revision sheet

## Must Remember
- Use frequency maps/arrays and a variable window; expand right, shrink left while constraint is violated.
- Maintain counts incrementally; each pointer advances at most n → O(n) expected time.
- Character assumptions matter: ASCII array vs full Unicode/code points; Java char is UTF-16 code unit.

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
