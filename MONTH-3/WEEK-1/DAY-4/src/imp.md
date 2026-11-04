# Tree Height, Node Count & Leaf Count — Important Notes

> Month 3 · Week 1 · Day 4 | Quick revision sheet

## Must Remember
- Height = 1 + max(leftHeight,rightHeight) under node-count convention; define empty height consistently.
- Node count = 1 + leftCount + rightCount; leaf count adds 1 only when both children are null.
- One postorder traversal computes these in O(n) time; recursion stack O(h).

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
