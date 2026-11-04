# Sliding Window: Variable Size — Important Notes

> Month 2 · Week 4 · Day 6 | Quick revision sheet

## Must Remember
- Expand right to include elements; shrink left while the window violates the condition.
- Maintain counts/sum incrementally; each pointer moves at most n times → O(n) time.
- Standard variable window works naturally for non-negative sum constraints; negatives may break monotonicity and require prefix sums/deque.

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
