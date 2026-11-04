# Stack Implementations & Deque — Important Notes

> Month 2 · Week 3 · Day 5 | Quick revision sheet

## Must Remember
- Stack is LIFO: push, pop, peek; use `ArrayDeque` for most Java stack use-cases.
- Deque supports add/remove at both ends; avoid legacy Stack unless required.
- Monotonic stack helps next-greater/smaller and span problems; each item is pushed/popped at most once.

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
