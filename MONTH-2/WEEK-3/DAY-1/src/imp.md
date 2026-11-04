# Linked List Nodes & Traversal — Important Notes

> Month 2 · Week 3 · Day 1 | Quick revision sheet

## Must Remember
- A node stores data and a next reference; head points to first node; null marks end.
- Traversal is O(n); access by index O(n); insert/delete at head O(1).
- Maintain head (and tail if used); handle empty and one-node lists.
- Java references are not contiguous array indices; update links carefully.

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
