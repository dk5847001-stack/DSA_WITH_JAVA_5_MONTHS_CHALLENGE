# Tree Traversals: Preorder, Inorder, Postorder — Important Notes

> Month 3 · Week 1 · Day 2 | Quick revision sheet

## Must Remember
- Preorder: Root-Left-Right; Inorder: Left-Root-Right; Postorder: Left-Right-Root.
- Each traversal visits every node once: O(n) time, O(h) recursion stack (h=tree height).
- Inorder of a BST yields sorted order (for standard unique-key ordering).
- Skewed tree height can be n; balanced tree height O(log n).

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
