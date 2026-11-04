# Heapify, Heap Sort & Top K — Concept Notes

> **Roadmap:** Month 3 · Week 2 · Day 6

## Core Idea
A binary heap is a complete tree. Min-heap root is minimum; parent=(i-1)/2, children=2i+1/2i+2. Peek O(1), insert/remove O(log n), heapify O(n).

## Important Concepts
- Understand the definition, purpose, operations, and suitable use-cases.
- Identify constraints and the invariant/state that must remain true.
- Compare a baseline with an optimized approach and explain correctness.
- Use clear Java methods, safe types, and appropriate standard-library collections.

## Dry-Run Workflow
1. Trace a small example before coding.
2. Track each index, pointer, node, variable, and state change.
3. Test empty/null input, one item, duplicates, boundaries, and maximum constraints.
4. Re-implement from a blank file without copying.

## Complexity
- Count iterations, recursive calls, sorting, and data-structure operations.
- Distinguish time, auxiliary space, and total space.
- State best/average/worst cases when relevant and justify each bound.

## Common Mistakes
- Off-by-one errors, wrong base/termination conditions, stale state, null handling, overflow.
- Ignoring preconditions or nested operation costs.
- Reporting complexity without accounting for extra memory.

## Revision Checklist
- [ ] Explain the topic without notes.
- [ ] Implement the core operation in Java.
- [ ] Test at least three edge cases.
- [ ] Explain time and auxiliary-space complexity.
- [ ] Record one mistake or new insight.
