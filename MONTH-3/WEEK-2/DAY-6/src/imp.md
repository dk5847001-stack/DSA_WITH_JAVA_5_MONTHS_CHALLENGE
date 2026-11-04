# Heapify, Heap Sort & Top K — Important Notes

> Month 3 · Week 2 · Day 6 | Quick revision sheet

## Must Remember
- Bottom-up heap construction from last non-leaf index n/2-1 is O(n), not O(n log n).
- Heap sort: build max-heap, swap root with end, shrink heap, sift down; O(n log n), in-place, not stable.
- Top-K often uses heap of size k: O(n log k) time, O(k) space.

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
