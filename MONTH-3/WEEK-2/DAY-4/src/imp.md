# Heap Concept, Min Heap & Max Heap — Important Notes

> Month 3 · Week 2 · Day 4 | Quick revision sheet

## Must Remember
- Binary heap is a complete binary tree stored compactly in an array.
- For index i: parent=(i-1)/2; left=2i+1; right=2i+2.
- Min-heap parent <= children; max-heap parent >= children; only root is guaranteed min/max.
- Peek O(1), insert/remove-root O(log n), build heap O(n).

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
