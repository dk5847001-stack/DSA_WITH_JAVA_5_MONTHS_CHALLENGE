# Reverse Linked List & Middle Node — Important Notes

> Month 2 · Week 3 · Day 3 | Quick revision sheet

## Must Remember
- Iterative reversal keeps `prev`, `curr`, `next`; save next before rewiring `curr.next=prev`.
- Advance prev/curr until null; new head is prev. O(n) time, O(1) extra space.
- Middle node: slow moves one, fast moves two; for even length clarify first vs second middle.
- Test empty, one node, two nodes, odd/even length.

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
