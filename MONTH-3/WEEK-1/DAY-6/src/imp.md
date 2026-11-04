# Lowest Common Ancestor & Path Problems — Important Notes

> Month 3 · Week 1 · Day 6 | Quick revision sheet

## Must Remember
- LCA is the deepest node that is ancestor of both targets.
- Recursive binary-tree approach: if root is null or matches a target, return root; combine left/right results; if both non-null, root is LCA.
- BST LCA can use value ordering to move left/right; O(h) time.
- Clarify whether both target nodes are guaranteed to exist.

## Complexity / Correctness
- Tree/BST operations depend on height h; balanced h≈log n, skewed h≈n.
- Heap root is min/max only; heap is not fully sorted.
- Include recursion stack, heap storage, and temporary collections in space.

## Common Traps
- Local-only BST validation, wrong two-child deletion, undefined duplicate policy.
- Treating PriorityQueue iteration as sorted.
- Confusing O(n) bottom-up heapify with repeated O(log n) insertion.

## Before Moving On
- [ ] Implement core operations in Java.
- [ ] Test empty, single, skewed, and duplicate cases.
- [ ] Explain time and auxiliary-space complexity.
