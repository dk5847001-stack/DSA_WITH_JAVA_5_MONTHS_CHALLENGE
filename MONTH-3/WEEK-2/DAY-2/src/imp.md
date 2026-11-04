# BST Delete, Minimum & Maximum — Important Notes

> Month 3 · Week 2 · Day 2 | Quick revision sheet

## Must Remember
- Delete has 3 cases: leaf (remove), one child (replace with child), two children (replace with inorder successor/predecessor, then delete it).
- Minimum is leftmost; maximum is rightmost.
- All operations O(h), with h up to n in a skewed BST.
- Update returned subtree root after recursive insert/delete.

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
