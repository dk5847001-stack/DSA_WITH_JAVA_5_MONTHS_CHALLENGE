# Array + Hashing Interview Problems — Concept Notes

> **Roadmap:** Month 5 · Week 3 · Day 1

## Core Idea
Combine a single array traversal with HashMap/HashSet for counts, complements, or seen values. Expected O(n) time is often possible with O(n) extra space.

## Interview Problem-Solving Flow
1. Restate the problem and clarify constraints/output.
2. Work through a small example and identify the likely pattern.
3. State a brute-force baseline and its complexity.
4. Derive the optimized invariant/data structure.
5. Implement readable Java code and test edge cases.
6. Explain correctness and time/space complexity aloud.

## Important Concepts
- Pattern recognition is based on constraints and required operations, not keywords alone.
- Track indices, pointers, node references, recursion state, and collection contents.
- Avoid premature optimization; correctness first, then improve bottlenecks.
- Rehearse concise communication: approach → proof intuition → complexity → edge cases.

## Complexity
- Count traversals, sorting, map/set operations, recursion, and heap operations.
- Include auxiliary collections and recursion stack.
- State expected versus worst-case behavior where relevant.

## Common Mistakes
- Coding before clarifying edge cases or constraints.
- Forgetting duplicate handling, empty/single input, and overflow.
- Giving a complexity label without explaining the dominant operation.

## Revision Checklist
- [ ] Solve at least one problem independently.
- [ ] Explain the pattern and invariant.
- [ ] Test normal, boundary, and adversarial cases.
- [ ] State time and auxiliary-space complexity.
- [ ] Record the mistake/pattern to revisit.
