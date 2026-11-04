# Tree Terminology & Binary Tree Implementation — Important Notes

> Month 3 · Week 1 · Day 1 | Quick revision sheet

## Must Remember
- Binary tree node has at most two children; root has no parent; leaf has no children.
- Height convention must be explicit (edges vs nodes); empty tree height often -1 or 0 depending convention.
- A tree with n nodes has n-1 edges; connected and acyclic.
- Recursive node structure: value, left, right.

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
