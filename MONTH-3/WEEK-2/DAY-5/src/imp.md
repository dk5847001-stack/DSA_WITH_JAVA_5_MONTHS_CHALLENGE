# Java PriorityQueue & Heap Problems — Important Notes

> Month 3 · Week 2 · Day 5 | Quick revision sheet

## Must Remember
- Java PriorityQueue is min-heap by default; `offer`, `poll`, `peek`; use Comparator.reverseOrder() for max-heap.
- offer/poll O(log n), peek O(1); contains/remove(Object) O(n).
- Do not assume iteration order is sorted; repeatedly poll for priority order.
- Store custom entries with comparator and tie-break rules.

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
