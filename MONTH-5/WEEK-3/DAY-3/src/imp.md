# Linked List + Stack Interview Problems — Important Notes

> Month 5 · Week 3 · Day 3 | Quick revision sheet

## Must Remember
- Linked list: preserve next before rewiring; dummy node simplifies head insert/delete/merge.
- Stack: LIFO; useful for matching brackets, monotonic patterns, and undoing recent choices.
- Test null, one node, even/odd length, and empty stack; avoid losing references.

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
