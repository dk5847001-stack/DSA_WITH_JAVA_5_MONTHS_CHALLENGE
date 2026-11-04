# Two Pointers Technique — Important Notes

> Month 2 · Week 4 · Day 3 | Quick revision sheet

## Must Remember
- Two pointers often work on sorted arrays or opposite ends; move one pointer only when the invariant proves skipped candidates cannot be answers.
- Common patterns: pair sum, reverse, remove duplicates, partition, fast/slow pointers.
- Sorting may enable the pattern but costs O(n log n) and may mutate input.

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
