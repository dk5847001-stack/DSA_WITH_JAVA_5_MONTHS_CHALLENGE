# Array + Hashing Interview Problems — Important Notes

> Month 5 · Week 3 · Day 1 | Quick revision sheet

## Must Remember
- Use HashMap for frequency/complement/index and HashSet for membership/deduplication.
- One-pass complement lookup can solve Two Sum in expected O(n); state whether original indices/order must be preserved.
- Always handle duplicates, same-element reuse, negative values, and overflow.

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
