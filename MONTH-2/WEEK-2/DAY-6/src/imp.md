# Quick Sort, Partition & Pivot — Important Notes

> Month 2 · Week 2 · Day 6 | Quick revision sheet

## Must Remember
- Partition places pivot into its final relative position; recursively sort the subranges.
- Average time O(n log n), worst O(n²) (e.g. consistently poor pivot); recursion stack average O(log n), worst O(n).
- In-place partition uses O(1) extra array storage; stability is not guaranteed.
- Use randomized/median pivot or introsort strategy to reduce pathological behavior.

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
