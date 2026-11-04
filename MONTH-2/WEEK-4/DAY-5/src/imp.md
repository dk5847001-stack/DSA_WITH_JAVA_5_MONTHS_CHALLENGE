# Sliding Window: Fixed Size — Important Notes

> Month 2 · Week 4 · Day 5 | Quick revision sheet

## Must Remember
- Fixed-size window: calculate first k elements, then add incoming and subtract outgoing value.
- Update answer after each complete window; O(n) time, O(1) extra space for running sum.
- Validate k (k<=0 or k>n) before indexing.

## Complexity / Correctness
- For arrays, count pointer movements and sorting; for trees, count node visits and recursion depth.
- Distinguish O(n) total work from O(h) stack depth.
- Make input assumptions explicit (sortedness, non-negative values, unique keys).

## Common Traps
- Duplicate answers, off-by-one windows, pointer not moving, invalid k.
- Confusing tree height measured in edges vs nodes.
- Assuming a tree is balanced or a window condition is monotonic without proof.

## Before Moving On
- [ ] Explain the invariant and preconditions.
- [ ] Implement in Java and dry-run edge cases.
- [ ] State time and auxiliary-space complexity.
