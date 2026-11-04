# Backtracking & Decision Trees — Concept Notes

> **Roadmap:** Month 3 · Week 3 · Day 4

## Core Idea
Backtracking follows choose → explore → unchoose. Restore state after each branch, record solutions at base cases, and skip duplicate branches when needed.

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
