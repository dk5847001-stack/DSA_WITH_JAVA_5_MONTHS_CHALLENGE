# Tree + DFS/BFS Interview Problems — Important Notes

> Month 5 · Week 3 · Day 4 | Quick revision sheet

## Must Remember
- DFS/postorder for subtree aggregates; BFS queue for level order and shortest unweighted depth.
- Define recursive return meaning (height, sum, match, etc.) and base case explicitly.
- O(n) traversal time; recursion stack O(h), worst O(n) for skewed tree.

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
