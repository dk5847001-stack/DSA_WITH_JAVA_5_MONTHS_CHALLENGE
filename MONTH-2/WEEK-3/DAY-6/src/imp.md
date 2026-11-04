# Queue, Circular Queue & PriorityQueue — Important Notes

> Month 2 · Week 3 · Day 6 | Quick revision sheet

## Must Remember
- Queue is FIFO: offer at tail, poll at head, peek at front; `ArrayDeque` is a strong default.
- Circular queue uses modulo capacity to wrap indices; track size or reserve a slot to distinguish full/empty.
- PriorityQueue is a min-heap by default; custom Comparator changes priority order.
- Queue operations are typically O(1); PriorityQueue offer/poll O(log n), peek O(1).

## Complexity / Correctness
- Count pointer traversals, stack/queue operations, heap adjustments, and hash operations.
- Include node references, temporary structures, and recursion stack in space analysis.
- State edge-case behavior explicitly.

## Common Traps
- Losing a node reference during rewiring; incorrect head/tail updates.
- Calling pop/poll on empty structures without checking.
- Assuming HashMap iteration order or worst-case constant-time hashing.

## Before Moving On
- [ ] Implement core operations in Java.
- [ ] Trace empty, one-element, and multi-element cases.
- [ ] Explain operation time and auxiliary space.
