# Tree Diameter & Balanced Tree — Important Notes

> Month 3 · Week 1 · Day 5 | Quick revision sheet

## Must Remember
- Tree diameter is the longest path between any two nodes; it may not pass through root.
- Postorder DFS returns subtree height and updates global diameter with leftHeight+rightHeight (edge convention).
- Balanced tree requires subtree heights differ by at most 1 at every node; naive repeated height calculation can be O(n²), return height/status together for O(n).

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
