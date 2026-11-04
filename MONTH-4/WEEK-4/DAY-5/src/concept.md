# 1D Dynamic Programming — Concept Notes

> **Roadmap:** Month 4 · Week 4 · Day 5

## Core Idea
Define the DP state, base case, transition, and evaluation order. Start from a recurrence, verify it on a tiny input, then analyze state count and work per state.

## DP Design Checklist
- **State:** What information uniquely describes a subproblem?
- **Base cases:** What is known without further work?
- **Transition:** How does the answer depend on smaller states?
- **Order:** In what order can dependencies be computed?
- **Answer:** Which state/cell contains the requested result?

## Important Concepts
- Overlapping subproblems make caching useful; optimal substructure supports combining subproblem answers.
- Memoization is top-down; tabulation is bottom-up.
- Confirm whether choices can be repeated, whether order matters, and whether indices are inclusive/exclusive.
- Use long if accumulated costs/counts may exceed int.

## Dry Run
1. Solve the smallest input manually.
2. Write the recurrence and base cases before coding.
3. Fill a small table and trace each transition.
4. Compare the implementation output with the manual table.

## Complexity
- Time = number of states × work per state.
- Space = table/cache plus recursion stack; state whether input storage is excluded.
- For optimized DP, explain exactly which prior states are retained.

## Common Mistakes
- Missing/incorrect base cases, wrong iteration order, invalid initialization, and off-by-one indices.
- Confusing subsequence with substring (contiguous).
- Applying space optimization before understanding dependencies.

## Revision Checklist
- [ ] Define state, base cases, transition, and answer state.
- [ ] Fill a small DP table manually.
- [ ] Implement memoization/tabulation in Java.
- [ ] Explain time and space complexity.
- [ ] Test empty, minimal, and boundary inputs.
