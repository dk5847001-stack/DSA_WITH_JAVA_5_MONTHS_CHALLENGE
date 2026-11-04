# Prefix/Suffix Techniques & Difference Array — Important Notes

> Month 5 · Week 2 · Day 5 | Quick revision sheet

## Must Remember
- Prefix sum: `pref[i+1]=pref[i]+a[i]`; range [l,r] sum = `pref[r+1]-pref[l]`.
- Difference array: range add [l,r] by +x at l and -x at r+1; prefix-scan to materialize.
- Suffix arrays scan right-to-left; useful for right-side aggregates and split problems.
- Use long for accumulated sums and allocate n+1 when using r+1.

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
