# Three Sum & Pair Optimization — Important Notes

> Month 2 · Week 4 · Day 4 | Quick revision sheet

## Must Remember
- Sort first, fix index i, then use left/right pointers; move based on sum comparison.
- Skip duplicate i/left/right values to avoid duplicate triplets.
- Typical complexity O(n²) time, O(1) extra space excluding sorting (sorting cost/storage depends on implementation).
- Use long for sum if integer overflow is possible.

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
