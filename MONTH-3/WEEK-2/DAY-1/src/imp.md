# Binary Search Tree: Search & Insert — Important Notes

> Month 3 · Week 2 · Day 1 | Quick revision sheet

## Must Remember
- Define the invariant and base cases; dry-run on a small structure.
- Handle empty, leaf, skewed, duplicate, and boundary cases.
- State time complexity and recursion/auxiliary space.

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
