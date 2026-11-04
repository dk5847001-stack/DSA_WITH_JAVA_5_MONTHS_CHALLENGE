# Cycle Detection & Merge Sorted Lists — Important Notes

> Month 2 · Week 3 · Day 4 | Quick revision sheet

## Must Remember
- Floyd's tortoise-hare: slow one step, fast two; meeting means a cycle exists (O(n) time, O(1) space).
- To find cycle start, reset one pointer to head and move both one step at a time.
- Merge two sorted lists with a dummy head and choose smaller current node each step.
- Do not lose the next pointer before relinking.

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
