# Sliding Window: Fixed Size — Concept Notes

> **Roadmap:** Month 2 · Week 4 · Day 5

## Core Idea
Maintain a window invariant. Fixed window adds incoming/removes outgoing; variable window expands right and shrinks left while condition fails.

## Important Concepts
- Define inputs, constraints, expected output, and the invariant/state.
- Know why the chosen technique works and which preconditions it requires.
- Start with a simple baseline; optimize only after correctness is clear.
- In Java, keep methods focused and use appropriate collections and safe types.

## Dry-Run Workflow
1. Trace a small example by hand.
2. Track every index, pointer, variable, reference, or recursive state change.
3. Test empty/minimum input, one item, duplicates, boundaries, and maximum constraints.
4. Re-code the solution from memory and explain each step.

## Complexity
- Count loop iterations, recursive calls, and collection operations.
- Distinguish time complexity, auxiliary space, and total space.
- State best/average/worst cases where relevant and justify the bound.

## Common Mistakes
- Off-by-one errors, wrong base/termination condition, stale state, null handling, overflow.
- Ignoring algorithm preconditions or nested operation costs.
- Copying an implementation without understanding its invariant.

## Quick Revision
- [ ] Explain the topic without notes.
- [ ] Implement the core operation in Java.
- [ ] Test at least three edge cases.
- [ ] Explain time and auxiliary-space complexity.
- [ ] Record a mistake or new insight.
