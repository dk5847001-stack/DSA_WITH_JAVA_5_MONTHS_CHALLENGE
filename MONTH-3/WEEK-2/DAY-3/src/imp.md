# Validate BST & Kth Smallest/Largest — Important Notes

> Month 3 · Week 2 · Day 3 | Quick revision sheet

## Must Remember
- Validate with global lower/upper bounds, not only immediate parent-child comparisons.
- Kth smallest: inorder traversal with counter; stop once k-th visited; O(h+k) early, O(n) worst.
- Define duplicate-key policy and handle invalid k/null tree.

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
