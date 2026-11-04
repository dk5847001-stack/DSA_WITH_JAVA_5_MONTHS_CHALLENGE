# Level Order Traversal & BFS — Important Notes

> Month 3 · Week 1 · Day 3 | Quick revision sheet

## Must Remember
- BFS visits nodes level by level using a queue; enqueue children after removing current node.
- Mark/track nodes to avoid repeat visits in graph-like structures; a proper tree has no cycles.
- Time O(n), auxiliary queue O(width) up to O(n).

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
