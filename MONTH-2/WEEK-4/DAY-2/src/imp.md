# Hashing Patterns: Two Sum & Duplicates — Important Notes

> Month 2 · Week 4 · Day 2 | Quick revision sheet

## Must Remember
- Hashing solution scans once: for each x, check whether target-x was seen, then store x; expected O(n) time, O(n) space.
- Check complement overflow and whether the same element may be used twice.
- Set detects duplicates; map can preserve index/frequency.
- Sorting + two pointers costs O(n log n) and may change original order.

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
