# Tree Terminology & Binary Tree Implementation — Concept Notes

> **Roadmap:** Month 3 · Week 1 · Day 1

## Core Idea
Binary trees have at most two children. Preorder is root-left-right, inorder left-root-right, postorder left-right-root, level-order uses a queue. BST ordering must hold globally.

## Important Concepts
- Understand definition, purpose, core operations, and suitable use-cases.
- Identify constraints and the invariant/state that must remain true.
- Compare brute force and optimized approaches; explain correctness.
- Use clear Java methods, safe types, and appropriate collections.

## Dry Run
1. Trace a small input by hand.
2. Track every pointer, index, node, variable, or state change.
3. Test null/empty, one element, duplicates, boundaries, and maximum constraints.
4. Re-implement from a blank file without copying.

## Complexity
- Count iterations, recursive calls, sorting, and data-structure operations.
- Distinguish time, auxiliary space, and total space.
- State best/average/worst cases when relevant and justify each bound.

## Common Mistakes
- Off-by-one errors, wrong base/termination conditions, stale state, null handling, overflow.
- Ignoring algorithm preconditions or nested operation costs.
- Reporting complexity without accounting for extra memory.

## Revision Checklist
- [ ] Explain the topic without notes.
- [ ] Implement core operations in Java.
- [ ] Test at least three edge cases.
- [ ] Explain time and auxiliary-space complexity.
- [ ] Record one mistake or new insight.
