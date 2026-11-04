# Word Search: Trie + DFS — Concept Notes

> **Roadmap:** Month 3 · Week 4 · Day 4

## Core Idea
A trie stores character paths; mark end-of-word separately from prefix existence. Insert/search take O(L) time for word length L; child representation affects memory.

## Important Concepts
- Understand the definition, purpose, operations, and use-cases.
- Identify input constraints and the invariant/state that must remain true.
- Compare a baseline with an optimized approach and explain correctness.
- Use clear Java methods, safe types, and appropriate collections.

## Dry-Run Workflow
1. Trace a small example before coding.
2. Track each pointer, index, node, variable, and recursive state change.
3. Test empty/null input, one item, duplicates, boundaries, and maximum constraints.
4. Re-implement independently from a blank file.

## Complexity
- Count iterations, recursive calls, sorting, and data-structure operations.
- Distinguish time, auxiliary space, and total space.
- State best/average/worst cases when relevant and justify the bound.

## Common Mistakes
- Off-by-one errors, incorrect base/termination conditions, stale state, null handling, overflow.
- Ignoring algorithm preconditions or repeated work.
- Forgetting to restore mutable state after recursive branches.

## Revision Checklist
- [ ] Explain the topic without notes.
- [ ] Implement the core operation in Java.
- [ ] Test at least three edge cases.
- [ ] Explain time and auxiliary-space complexity.
- [ ] Record one mistake or new insight.
