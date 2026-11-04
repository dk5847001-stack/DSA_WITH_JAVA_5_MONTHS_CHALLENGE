# Week 10 Revision & Practice — Important Notes

> Month 3 · Week 2 · Day 7 | Quick revision sheet

## Must Remember
- Review traversals, BFS, height/count/diameter, balance checks, LCA, and path recursion.
- Define height convention and recursive return meaning clearly.
- Test empty, single-node, skewed, balanced, and missing-target cases.

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
