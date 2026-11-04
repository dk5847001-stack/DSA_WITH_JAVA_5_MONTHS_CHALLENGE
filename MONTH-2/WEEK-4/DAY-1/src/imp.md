# HashMap, HashSet & Frequency Maps — Important Notes

> Month 2 · Week 4 · Day 1 | Quick revision sheet

## Must Remember
- HashMap stores key→value; HashSet stores unique keys. Expected put/get/contains O(1), worst case can degrade.
- Frequency: `map.put(x, map.getOrDefault(x,0)+1)`; count occurrences and handle missing keys.
- HashMap permits one null key; HashSet permits one null; iteration order is not guaranteed.
- Define equality/hashCode consistently for custom key objects.

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
