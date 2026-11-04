# Bit Manipulation, XOR & Bit Masks — Important Notes

> Month 5 · Week 2 · Day 6 | Quick revision sheet

## Must Remember
- `x & 1` checks odd; `x & (1<<k)` tests bit k; `x | (1<<k)` sets; `x & ~(1<<k)` clears; `x ^ (1<<k)` toggles.
- XOR: x^x=0, x^0=x, commutative/associative; useful for unique-element patterns.
- `1 << k` uses int width; use `1L << k` for long masks; beware sign bit and Java shift rules.
- `n & (n-1)` removes lowest set bit; power of two iff n>0 and `(n&(n-1))==0`.

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
